package com.example.demo;

public class VideoNotFoundException extends RuntimeException {
    public VideoNotFoundException(Long id) {
        super("Nie znaleziono wideo o ID: "+ id);
    }
}
