package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ItemController {

    @PostMapping("/items")
    public String newItem(@RequestBody Item item) {
        // process item
        return "done";
    }

    @PostMapping("/new-item")
    public String newVideo(@ModelAttribute Item newItem) {
        return "redirect:/";
    }

    record Item(String id, String description, Long price) {
    }
}
