package com.pea2u.letter2future.service;

import com.pea2u.letter2future.dto.CustomerDto;

public interface CustomerService {

    CustomerDto createCustomer(CustomerDto customer);

    CustomerDto queryCustomer(CustomerDto customer);

    String wxLoin(String code);

}
