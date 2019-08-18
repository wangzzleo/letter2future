package com.pea2u.letter2future.service;

public interface NoticeService {

    /**
     * 获取客户未读通知数量
     * @param id
     * @return
     */
    int getCustNoticeCount(int id);

}
