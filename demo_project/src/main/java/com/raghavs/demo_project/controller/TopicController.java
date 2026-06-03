package com.raghavs.demo_project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.raghavs.demo_project.model.Topic;
import com.raghavs.demo_project.service.TopicService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping()
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @PostMapping()
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    @PutMapping("/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
    {
        topicService.updateTopic(topic, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }


   
}
