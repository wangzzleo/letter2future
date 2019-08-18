package com.pea2u.letter2future.service.impl;

import com.pea2u.letter2future.dto.LetterDTO;
import com.pea2u.letter2future.mapper.AppCustomerMapper;
import com.pea2u.letter2future.mapper.AppLetterMapper;
import com.pea2u.letter2future.model.AppCustomer;
import com.pea2u.letter2future.service.LetterService;
import com.pea2u.letter2future.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("letterService")
public class LetterServiceImpl implements LetterService {

    @Autowired
    private AppLetterMapper letterMapper;

    @Autowired
    private AppCustomerMapper customerMapper;

    @Override
    public boolean createLetter(LetterDTO letterDto) {
        return false;
    }

    @Override
    public boolean removeLetter(int id) {
        return false;
    }

    @Override
    public int countMyLetter(int custId) {
        // 统计用户收到的信件数量
        AppCustomer appCustomer = customerMapper.selectByPrimaryKey(custId);
        if (appCustomer != null && StringUtils.isNotBlank(appCustomer.getEmail())) {
            // 因为邮箱验证是免费的，所以现在只能验证对方发送到邮箱的信件数量

        }
        return 0;
    }
}
