package com.longuto.mybatis.web;

import com.longuto.mybatis.dao.domain.MusicInfo;
import com.longuto.mybatis.dao.domain.UserInfo;
import com.longuto.mybatis.service.MusicInfoService;
import com.longuto.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    private static final String INDEX = "index";

    @Autowired
    private MusicInfoService musicInfoService;

    @RequestMapping("/show")
    public String getIndex() {
        return INDEX;
    }

    @RequestMapping("/music")
    @ResponseBody
    public List<MusicInfo> getMusicInfo() {
        List<MusicInfo> musicInfoList = musicInfoService.getMusicInfo(null);
        return musicInfoList;
    }

    @RequestMapping("/insertMusic")
    @ResponseBody
    public MusicInfo insertMusic(MusicInfo musicInfo) {
        musicInfoService.insertMusic(musicInfo);
        return musicInfo;
    }
}
