package com.pea2u.letter2Future.service.impl;

import com.pea2u.letter2Future.mapper.UserMapper;
import com.pea2u.letter2Future.model.User;
import com.pea2u.letter2Future.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangzz
 * @date
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User sayHello(int id) {
        User user = userMapper.selectByPrimaryKey(1);
        return user;
    }
}
