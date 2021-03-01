package org.ming.sp.service;

import org.ming.sp.domain.Video;
import org.springframework.stereotype.Component;

@Component("videoService")
public class VideoServiceImpl implements VideoService{

    @Override
    public int save(Video video) {
        System.out.println("保存Video");
        return 1;
    }

    @Override
    public Video findById(int id) {
        System.out.println("根據id找影片");
        return new Video();
    }
}
