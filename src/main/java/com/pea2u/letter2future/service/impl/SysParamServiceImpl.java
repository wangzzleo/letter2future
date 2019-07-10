package com.pea2u.letter2future.service.impl;

import com.pea2u.letter2future.dto.SysParamDTO;
import com.pea2u.letter2future.mapper.SysParamMapper;
import com.pea2u.letter2future.model.SysParam;
import com.pea2u.letter2future.service.SysParamService;
import com.pea2u.letter2future.util.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangzz
 * @date 2019年7月10日13:42:36
 * 获取系统参数
 */
@Service("sysParamService")
public class SysParamServiceImpl implements SysParamService {

    @Autowired
    private SysParamMapper sysParamMapper;

    @Override
    public SysParamDTO getSysParam(String paramKey) {
        SysParamDTO sysParamDTO = null;
        if (!StringUtils.isBlank(paramKey)) {
            sysParamDTO = new SysParamDTO();
            SysParam sysParam = sysParamMapper.selectByParamKey(paramKey);
            BeanUtils.copyProperties(sysParam, sysParamDTO);
        }
        return sysParamDTO;
    }

    @Override
    public List<SysParamDTO> getSysParams(String paramKey) {
        return null;
    }
}
