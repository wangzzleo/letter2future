package com.pea2u.letter2Future.mapper;

import com.pea2u.letter2Future.model.AppNotice;
import com.pea2u.letter2Future.model.AppNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppNoticeMapper {
    int countByExample(AppNoticeExample example);

    int deleteByExample(AppNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppNotice record);

    int insertSelective(AppNotice record);

    List<AppNotice> selectByExample(AppNoticeExample example);

    AppNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppNotice record, @Param("example") AppNoticeExample example);

    int updateByExample(@Param("record") AppNotice record, @Param("example") AppNoticeExample example);

    int updateByPrimaryKeySelective(AppNotice record);

    int updateByPrimaryKey(AppNotice record);
}