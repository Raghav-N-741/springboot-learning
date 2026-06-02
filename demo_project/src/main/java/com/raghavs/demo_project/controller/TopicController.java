package com.raghavs.demo_project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.raghavs.demo_project.model.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
            new Topic("spring","11","i am the one"),
            new Topic("boot","101","The  next"),
            new Topic("Raggs","hehe","the last one"));
    }
}
