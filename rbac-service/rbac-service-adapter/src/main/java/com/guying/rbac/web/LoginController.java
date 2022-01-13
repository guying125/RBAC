/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.web;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.guying.rbac.util.IOUtils3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 描述：登录控制器
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("login")
public class LoginController {
    private static final String JPG = "jpg";
    private static final String IMAGE_JPEG = "image/jpeg";
    private static final String CACHE_CONTROL = "Cache-Control";
    private static final String NO_STORE_NO_CACHE = "no-store, no-cache";

    @Autowired
    private Producer producer;

    @GetMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response, HttpServletRequest request) throws IOException {
        log.info("登录-生成验证码-开始");
        response.setHeader(CACHE_CONTROL, NO_STORE_NO_CACHE);
        response.setContentType(IMAGE_JPEG);

        // 生成文字密码
        String text = producer.createText();
        // 生成图片验证码
        BufferedImage image = producer.createImage(text);
        // 保存验证码到 session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);

        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image, JPG, outputStream);
        IOUtils3.closeQuietly(outputStream);
        log.info("登录-生成验证码-结束");
    }
}
