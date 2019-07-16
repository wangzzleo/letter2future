package com.pea2u.letter2future.controller;

import com.pea2u.letter2future.common.CommonResult;
import com.pea2u.letter2future.dto.CustomerDto;
import com.pea2u.letter2future.dto.NoticeDTO;
import com.pea2u.letter2future.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzz
 * @date 2019年7月9日20:10:48
 */
@RestController
@RequestMapping("/api/wx/customer")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CommonResult<CustomerDto> signIn(String wxId) {
        return null;
    }

    /**
     * 小程序用户登录接口（暂时）
     * 小程序登录流程：https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/login.html
     * 请求地址：GET https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
     * 1. 小程序端获取code，并发送给开发者服务器
     * 2. 开发者使用该code + appid + appsecret 等获取session_key和openid
     * 3. 开发者服务根据openid和sessionkey自定义登录状态，并返回给小程序端
     * 4. 小程序端本地缓存自定义状态，每次请求使用该状态
     * 5. 服务端根据该状态验证登录状态，进行相应业务，登录完成。
     * @param code 小程序临时登录凭证
     * @return 登录响应信息
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult<CustomerDto> login(String code) {
        log.info("微信code：{} 正在登录...", code);
        Assert.hasText(code, "未获取到用户信息");
        CustomerDto customerDtoQuery = new CustomerDto();
        CustomerDto customerDto = customerService.queryCustomer(customerDtoQuery);
        return CommonResult.success(customerDto);
    }

    /**
     * 主动获取通知
     * @return
     */
    @RequestMapping(value = "/notice", method = RequestMethod.POST)
    public CommonResult<NoticeDTO> getNotice(){
        return null;
    }

}
