package com.longuto.mybatis.service.impl;

import com.longuto.mybatis.dao.domain.MusicInfo;
import com.longuto.mybatis.dao.mapper.MusicInfoMapper;
import com.longuto.mybatis.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo) {
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll(null);
        return musicInfos;
    }

    @Override
    public void insertMusic(MusicInfo musicInfo) {
        musicInfoMapper.insertMusic(musicInfo);
    }
}
