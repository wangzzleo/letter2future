package com.pea2u.letter2Future.mapper;

import com.pea2u.letter2Future.model.AppLetter;
import com.pea2u.letter2Future.model.AppLetterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppLetterMapper {
    int countByExample(AppLetterExample example);

    int deleteByExample(AppLetterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppLetter record);

    int insertSelective(AppLetter record);

    List<AppLetter> selectByExampleWithBLOBs(AppLetterExample example);

    List<AppLetter> selectByExample(AppLetterExample example);

    AppLetter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppLetter record, @Param("example") AppLetterExample example);

    int updateByExampleWithBLOBs(@Param("record") AppLetter record, @Param("example") AppLetterExample example);

    int updateByExample(@Param("record") AppLetter record, @Param("example") AppLetterExample example);

    int updateByPrimaryKeySelective(AppLetter record);

    int updateByPrimaryKeyWithBLOBs(AppLetter record);

    int updateByPrimaryKey(AppLetter record);
}