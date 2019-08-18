package com.pea2u.letter2future.service.impl;

import com.alibaba.fastjson.JSON;
import com.pea2u.letter2future.bo.WxSession;
import com.pea2u.letter2future.common.CustomerStatusEnum;
import com.pea2u.letter2future.common.WxAuthErrorCodeEnum;
import com.pea2u.letter2future.dto.CustomerDTO;
import com.pea2u.letter2future.dto.CustomerQO;
import com.pea2u.letter2future.mapper.AppCustomerMapper;
import com.pea2u.letter2future.model.AppCustomer;
import com.pea2u.letter2future.service.CustomerService;
import com.pea2u.letter2future.util.HttpClientUtils;
import com.pea2u.letter2future.util.StringUtils;
import com.pea2u.letter2future.util.WxUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzz
 * @date 2019年7月5日 15:55:38
 * 客户信息服务实现类
 */
@Service("wxCustomerService")
public class WxCustomerServiceImpl implements CustomerService {

    @Autowired
    private AppCustomerMapper appCustomerMapper;

    @Value("${wx.authUrl}")
    private String WX_AUTH_URL;

    @Value("${wx.appId}")
    private String APPID;

    @Value("${wx.secret}")
    private String SECRET;

    @Value("${wx.grantType}")
    private String grant_type;

    @Override
    public CustomerDTO createCustomer(CustomerQO customerQO) {
        CustomerDTO customerDTO = new CustomerDTO();
        AppCustomer appCustomer = new AppCustomer();
        appCustomer.setCustName(customerQO.getCustName());
        appCustomer.setStatus((byte)0);
        appCustomerMapper.insertSelective(appCustomer);
        BeanUtils.copyProperties(appCustomer, customerDTO);
        return customerDTO;
    }

    @Override
    public CustomerDTO queryCustomer(CustomerQO customerQO) {
        String code = customerQO.getCode();
        CustomerDTO customerDTO = new CustomerDTO();
        // 请求微信接口获取session
        Map<String, String> param = new HashMap<>(8);
        param.put("appid", APPID);
        param.put("secret", SECRET);
        param.put("js_code", code);
        param.put("grant_type", grant_type);
        String res = HttpClientUtils.sendGetSSLRequest(WX_AUTH_URL, param);
        if (StringUtils.isNotBlank(res)) {
            WxSession wxSession = JSON.parseObject(res, WxSession.class);
            WxAuthErrorCodeEnum wxAuthErrorCode = WxUtils.checkWxSession(wxSession);
            if (wxAuthErrorCode.equals(WxAuthErrorCodeEnum.SUCCESS)) {
                //获取用户信息
                AppCustomer appCustomer = appCustomerMapper.selectByWxId(wxSession.getOpenid());
                if (appCustomer == null) {
                    //初次注册
                    customerDTO.setStatus(CustomerStatusEnum.FIRST_REGISTER.getStatus());
                } else {
                    //非首次注册
                    BeanUtils.copyProperties(appCustomer, customerDTO);
                }
            } else {
                //微信登录失败
                customerDTO.setStatus(CustomerStatusEnum.WX_LOGIN_FAIL.getStatus());
            }
        }
        return customerDTO;
    }

    @Override
    public CustomerDTO closeCustomer(CustomerQO customer) {
        AppCustomer appCustomer = new AppCustomer();
        appCustomer.setWxId(customer.getWxId());
        appCustomer.setStatus((byte)2);
        appCustomerMapper.updateStatusByWxId(appCustomer);
        return null;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customer) {
        AppCustomer appCustomer = new AppCustomer();
        BeanUtils.copyProperties(customer, appCustomer);
        appCustomerMapper.updateByPrimaryKeySelective(appCustomer);
        return null;
    }
}
