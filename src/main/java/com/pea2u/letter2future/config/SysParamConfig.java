package com.pea2u.letter2future.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 系统参数配置
 */
@Configuration
public class SysParamConfig {

    @Value("${letter2future.sysParamPermitString}")
    private String sysParamPermitSet;

    public HashSet<String> getSysParamPermitSet() {
        return new HashSet<>(Arrays.asList(sysParamPermitSet.split(",")));
    }

}
