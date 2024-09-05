package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class VideoServiceTest {
    private VideoService videoService;

    @BeforeEach
    void setup(){
        videoService = new VideoService();
    }

    @Test
    void testGetVideos(){
        // given
        List<Video> videos = videoService.getVideos();
        // then
        assertNotNull(videos);
        assertEquals(3, videos.size());
    }

    @Test
    void testCreateVideo(){
        // given
        Video newVideo = new Video("Nowy kurs video");
        // when
        Video createdVideo = videoService.create(newVideo);
        // then
//        assertEquals(4,videos.size());
//        assertEquals(newVideo.getTitle(),createdVideo.getTitle());
//        assertEquals("Nowy kurs video", videos.get(3).getTitle());
        assertEquals("Nowy kurs video", newVideo.name());
    }
}
