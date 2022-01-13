/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageQuery;
import com.alibaba.cola.dto.Response;
import com.guying.rbac.dto.DictDTO;
import com.guying.rbac.dto.DictRequest;
import com.guying.rbac.service.SysDictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * 描述：字典
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("dict")
public class SysDictController {
    @Autowired
    private SysDictService sysDictService;

    @PostMapping("/save")
    public Response save(@RequestBody DictRequest dictRequest) {
        log.info("字典——保存字典");

        return Response.buildSuccess();
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<DictRequest> dictRequestList) {
        log.info("字典——删除字典");

        return Response.buildSuccess();
    }

    @PostMapping("/update")
    public Response update(@RequestBody DictRequest dictRequest) {
        log.info("字典——维护字典");

        return Response.buildSuccess();
    }

    @PostMapping("/findPage")
    public MultiResponse<DictDTO> findPage(@RequestBody PageQuery pageQuery) {
        log.info("字典——分页查询");

        return MultiResponse.of(Collections.emptyList());
    }

    @GetMapping("/findByLabel")
    public MultiResponse<DictDTO> findByLabel(@RequestParam("label") String label) {
        log.info("字典——根据标签查询");

        return MultiResponse.of(Collections.emptyList());
    }
}
