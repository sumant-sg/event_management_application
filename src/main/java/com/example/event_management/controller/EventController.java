package com.example.event_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    @RequestMapping(value="/events")
    public String displayHomePage() {
        return "events.html";
    }

}