package com.pea2u.letter2future.mapper;

import com.pea2u.letter2future.model.SysParam;
import com.pea2u.letter2future.model.SysParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysParamMapper {
    int countByExample(SysParamExample example);

    int deleteByExample(SysParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysParam record);

    int insertSelective(SysParam record);

    List<SysParam> selectByExampleWithBLOBs(SysParamExample example);

    List<SysParam> selectByExample(SysParamExample example);

    SysParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysParam record, @Param("example") SysParamExample example);

    int updateByExampleWithBLOBs(@Param("record") SysParam record, @Param("example") SysParamExample example);

    int updateByExample(@Param("record") SysParam record, @Param("example") SysParamExample example);

    int updateByPrimaryKeySelective(SysParam record);

    int updateByPrimaryKeyWithBLOBs(SysParam record);

    int updateByPrimaryKey(SysParam record);

    SysParam selectByParamKey(String paramKey);
}