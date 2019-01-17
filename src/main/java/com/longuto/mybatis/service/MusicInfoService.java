package com.longuto.mybatis.service;

import com.longuto.mybatis.dao.domain.MusicInfo;

import java.util.List;

public interface MusicInfoService {

    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo);

    void insertMusic(MusicInfo musicInfo);
}
