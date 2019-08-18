package com.pea2u.letter2future.service;

import com.pea2u.letter2future.dto.CustomerDTO;
import com.pea2u.letter2future.dto.CustomerQO;

public interface CustomerService {

    /**
     * 初始化用户信息
     * @param customer 简单用户信息
     * @return 详细用户信息
     */
    CustomerDTO createCustomer(CustomerQO customer);

    /**
     * 注销
     * @param customer
     * @return
     */
    CustomerDTO closeCustomer(CustomerQO customer);

    /**
     * 修改用户信息
     * @param customer
     * @return
     */
    CustomerDTO updateCustomer(CustomerDTO customer);

    /**
     * 查询用户信息
     * @param customer
     * @return
     */
    CustomerDTO queryCustomer(CustomerQO customer);

}
