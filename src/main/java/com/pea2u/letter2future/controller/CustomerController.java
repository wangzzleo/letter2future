package com.pea2u.letter2future.controller;

import com.pea2u.letter2future.common.CommonResult;
import com.pea2u.letter2future.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzz
 * @date 2019年7月9日20:10:48
 */
@RestController
@RequestMapping("/api/wx/customer")
public class CustomerController {

    public CommonResult<CustomerDto> signIn(String wxId) {
        return null;
    }

}
