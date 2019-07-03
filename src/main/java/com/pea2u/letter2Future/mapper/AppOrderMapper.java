package com.pea2u.letter2Future.mapper;

import com.pea2u.letter2Future.model.AppOrder;
import com.pea2u.letter2Future.model.AppOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppOrderMapper {
    int countByExample(AppOrderExample example);

    int deleteByExample(AppOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppOrder record);

    int insertSelective(AppOrder record);

    List<AppOrder> selectByExample(AppOrderExample example);

    AppOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppOrder record, @Param("example") AppOrderExample example);

    int updateByExample(@Param("record") AppOrder record, @Param("example") AppOrderExample example);

    int updateByPrimaryKeySelective(AppOrder record);

    int updateByPrimaryKey(AppOrder record);
}