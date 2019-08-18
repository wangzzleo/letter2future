package com.pea2u.letter2future.service.impl;

import com.pea2u.letter2future.mapper.AppNoticeMapper;
import com.pea2u.letter2future.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private AppNoticeMapper noticeMapper;

    @Override
    public int getCustNoticeCount(int id) {
        return noticeMapper.selectCountByCustIdAndStatus(id);
    }
}
