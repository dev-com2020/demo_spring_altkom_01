package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VideoService {

    private final VideoRepository videoRepository;

    private List<Video> videos = new ArrayList<>();

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video newVideo) {
        videos.add(newVideo);
        return newVideo;
    }


    public Video getVideo(Long id) {
        return videoRepository.findById(id).orElseThrow(() -> new VideoNotFoundException(id));
    }

    public Video deleteVideo(Long id) {
        videoRepository.deleteById(id);
        return null;
    }
}