package com.pea2u.letter2Future.mapper;

import com.pea2u.letter2Future.model.AppCustomer;
import com.pea2u.letter2Future.model.AppCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppCustomerMapper {
    int countByExample(AppCustomerExample example);

    int deleteByExample(AppCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppCustomer record);

    int insertSelective(AppCustomer record);

    List<AppCustomer> selectByExample(AppCustomerExample example);

    AppCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppCustomer record, @Param("example") AppCustomerExample example);

    int updateByExample(@Param("record") AppCustomer record, @Param("example") AppCustomerExample example);

    int updateByPrimaryKeySelective(AppCustomer record);

    int updateByPrimaryKey(AppCustomer record);
}