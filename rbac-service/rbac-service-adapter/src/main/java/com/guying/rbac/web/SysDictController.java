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
import com.guying.rbac.consts.ResponseErrorInfo;
import com.guying.rbac.dto.DictDTO;
import com.guying.rbac.dto.DictRequest;
import com.guying.rbac.service.SysDictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
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
        try {
            boolean success = sysDictService.save(dictRequest);
            if (success) {
                log.info("字典——保存字典-成功");
                return Response.buildSuccess();
            } else {
                log.error("字典——保存字典-失败");
                return Response.buildFailure(ResponseErrorInfo.SAVE_FAILURE.getCode(),
                                             ResponseErrorInfo.SAVE_FAILURE.getMessage());
            }
        } catch (Exception ex) {
            log.error("字典——保存字典-失败");
            return Response.buildFailure(ResponseErrorInfo.SAVE_FAILURE2.getCode(),
                                         ResponseErrorInfo.SAVE_FAILURE2.getMessage());
        }
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<DictRequest> dictRequestList) {
        log.info("字典——删除字典");
        if (CollectionUtils.isEmpty(dictRequestList)) {
            log.error("列表为空");
            return Response.buildFailure(ResponseErrorInfo.DELETE_REQUEST_EMPTY.getCode(),
                                         ResponseErrorInfo.DELETE_REQUEST_EMPTY.getMessage());
        }
        try {
            boolean success = sysDictService.delete(dictRequestList);
            if (success) {
                log.info("字典——删除字典-成功");
                return Response.buildSuccess();
            } else {
                log.error("字典——删除字典-失败");
                return Response.buildFailure(ResponseErrorInfo.DELETE_FAILURE.getCode(),
                                             ResponseErrorInfo.DELETE_FAILURE.getMessage());
            }
        } catch (Exception ex) {
            log.error("字典——删除字典-失败");
            return Response.buildFailure(ResponseErrorInfo.DELETE_FAILURE2.getCode(),
                                         ResponseErrorInfo.DELETE_FAILURE2.getMessage());
        }
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
