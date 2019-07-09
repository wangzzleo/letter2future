package com.pea2u.letter2future.controller;

import com.pea2u.letter2future.common.CommonResult;
import com.pea2u.letter2future.dto.SysParamDTO;
import com.pea2u.letter2future.model.SysParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzz
 * @date 2019年7月9日 19:23:43
 * 获取系统参数
 */
@RestController
@RequestMapping("/api/wx/param")
public class SysParamController {


    @RequestMapping("/get")
    public CommonResult<SysParamDTO> getSysParam(String paramKey) {
        return null;
    }


}
