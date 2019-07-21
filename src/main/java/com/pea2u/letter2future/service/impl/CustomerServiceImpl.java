package com.pea2u.letter2future.service.impl;

import com.pea2u.letter2future.dto.CustomerDto;
import com.pea2u.letter2future.mapper.AppCustomerMapper;
import com.pea2u.letter2future.model.AppCustomer;
import com.pea2u.letter2future.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangzz
 * @date 2019年7月5日 15:55:38
 * 客户信息服务实现类
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private AppCustomerMapper appCustomerMapper;

    @Override
    public CustomerDto createCustomer(CustomerDto customer) {
        return null;
    }

    @Override
    public CustomerDto queryCustomer(CustomerDto customer) {
        AppCustomer appCustomer = appCustomerMapper.selectByPrimaryKey(1);
        CustomerDto customerDto = new CustomerDto();
        customerDto.setNoticeStatus(1);
        customerDto.setReceiveLetterCount(1);
        BeanUtils.copyProperties(appCustomer, customerDto);
        return customerDto;
    }

    @Override
    public CustomerDto queryWxCustomer(String openid) {
        CustomerDto customerDto = new CustomerDto();
        AppCustomer appCustomer = appCustomerMapper.selectByWxId(openid);
        if (appCustomer != null) {
            BeanUtils.copyProperties(appCustomer, customerDto);
        } else {
            customerDto = null;
        }
        return customerDto;
    }

    @Override
    public String wxLoin(String code) {
        return null;
    }
}
