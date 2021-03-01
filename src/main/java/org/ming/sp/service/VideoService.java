package org.ming.sp.service;

import org.ming.sp.domain.Video;

public interface VideoService {

    int save(Video video);

    Video findById(int id);
}
