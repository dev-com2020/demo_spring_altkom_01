package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class VideoServiceMockTest {

    @Mock
    private List<Video> mockVideos;

    @InjectMocks
    private VideoService videoService;

    @BeforeEach
    void setup(){
        when(mockVideos.size()).thenReturn(2);
    }

    @Test
    void testGetVideos(){

        List<Video> videos = videoService.getVideos();
        assertEquals(2, videos.size());
    }

    @Test
    void testCreateVideo(){

        Video newVideo = new Video("Nowy kurs video");
        videoService.create(newVideo);
        verify(mockVideos, times(1)).add(newVideo);

    }

}
