package org.ming.sp.domain;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Video {

    public void init (){
        System.out.println("video init方法");
    }
    private int id;

    private String title;

    private List<String> chapterList;

    private Map<Integer,String> videoMap;

    public List<String> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<String> chapterList) {
        this.chapterList = chapterList;
    }

    public Map<Integer, String> getVideoMap() {
        return videoMap;
    }

    public void setVideoMap(Map<Integer, String> videoMap) {
        this.videoMap = videoMap;
    }

    public Video() {

    }

    public Video(String title){
        System.out.println("video 傳入參數的建構子被呼叫");
        this.title = title;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
