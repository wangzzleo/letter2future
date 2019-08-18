package com.pea2u.letter2future.mapper;

import com.pea2u.letter2future.model.AppNotice;
import com.pea2u.letter2future.model.AppNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppNoticeMapper {
    int countByExample(AppNoticeExample example);

    int deleteByExample(AppNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppNotice record);

    int insertSelective(AppNotice record);

    List<AppNotice> selectByExampleWithBLOBs(AppNoticeExample example);

    List<AppNotice> selectByExample(AppNoticeExample example);

    AppNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppNotice record, @Param("example") AppNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") AppNotice record, @Param("example") AppNoticeExample example);

    int updateByExample(@Param("record") AppNotice record, @Param("example") AppNoticeExample example);

    int updateByPrimaryKeySelective(AppNotice record);

    int updateByPrimaryKeyWithBLOBs(AppNotice record);

    int updateByPrimaryKey(AppNotice record);

    int selectCountByCustIdAndStatus(Integer custId);
}