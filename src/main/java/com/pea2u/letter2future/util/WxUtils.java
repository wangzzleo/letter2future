package com.pea2u.letter2future.util;

import com.pea2u.letter2future.bo.WxSession;
import com.pea2u.letter2future.common.WxAuthErrorCodeEnum;

public class WxUtils {

    public static WxAuthErrorCodeEnum checkWxSession(WxSession wxSession) {
        WxAuthErrorCodeEnum ret = WxAuthErrorCodeEnum.SUCCESS;
        if (wxSession == null) {
            ret = WxAuthErrorCodeEnum.FAIL;
        } else if (StringUtils.isBlank(wxSession.getOpenid())) {
            WxAuthErrorCodeEnum.getByErrCode(wxSession.getErrcode());
        }
        return ret;
    }

}
