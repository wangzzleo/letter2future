package com.pea2u.letter2future.controller;

import com.pea2u.letter2future.common.CommonResult;
import com.pea2u.letter2future.dto.SysParamDTO;
import com.pea2u.letter2future.service.SysParamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzz
 * @date 2019年7月9日 19:23:43
 * 获取系统参数
 */
@RestController
@RequestMapping("/api/wx/param")
@Slf4j
public class SysParamController {

    @Autowired
    private SysParamService sysParamService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public CommonResult<SysParamDTO> getSysParam(String paramKey) {
        log.info("查询系统参数，入参:{}", paramKey);
        Assert.hasText(paramKey, "参数名称不可为空");
        SysParamDTO sysParam = sysParamService.getSysParam(paramKey);
        return CommonResult.success(sysParam);
    }


}
