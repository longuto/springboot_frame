package com.longuto.mybatis.dao.mapper;

import com.longuto.mybatis.dao.domain.MusicInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MusicInfoMapper {

    @ResultMap("BaseResultMap")
    @Select("select * from music_info")
    List<MusicInfo> selectAll(MusicInfo musicInfo);


    @Insert("insert into music_info (id, singer_name, music_size, music_name) values (#{id}, #{singerName}, #{musicSize}, #{musicName})")
    void insertMusic(MusicInfo musicInfo);
}
