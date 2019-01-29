package com.tz.cms.sysmgr.mapper;

import com.tz.cms.sysmgr.entity.Area;
import com.tz.cms.sysmgr.entity.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    int countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    // 2
    int deleteByPrimaryKey(Integer id);

    
    int insert(Area record);

    // 1
    int insertSelective(Area record);

    List<Area> selectByExample(AreaExample example);

    // 4
    Area selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    // 3
    int updateByPrimaryKeySelective(Area record);
    
    
    int updateByPrimaryKey(Area record);
}