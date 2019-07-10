package com.pea2u.letter2future.service;

import com.pea2u.letter2future.dto.SysParamDTO;

import java.util.List;

public interface SysParamService {

    SysParamDTO getSysParam(String paramKey);

    List<SysParamDTO> getSysParams(String paramKey);

}
