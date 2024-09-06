package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    private final VideoService videoService;

    public ApiController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/api/videos")
    public List<Video> all() {
        return videoService.getVideos();
    }

    @PostMapping("/api/videos")
    public Video newVideo(@RequestBody Video newVideo) {
        return videoService.create(newVideo);
    }

    @GetMapping("/api/videos/{id}")
    public Video getVideo(@PathVariable Long id) {
        return videoService.getVideo(id);
    }

    @DeleteMapping("/api/videos/{id}")
    public Video newVideo(@PathVariable Long id) {
        return videoService.deleteVideo(id);
    }


}
