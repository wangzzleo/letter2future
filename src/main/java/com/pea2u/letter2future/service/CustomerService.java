package com.pea2u.letter2future.service;

import com.pea2u.letter2future.dto.CustomerDTO;
import com.pea2u.letter2future.dto.CustomerQO;

public interface CustomerService {

    CustomerDTO createCustomer(CustomerQO customer);

    CustomerDTO queryCustomer(CustomerQO customer);

}
