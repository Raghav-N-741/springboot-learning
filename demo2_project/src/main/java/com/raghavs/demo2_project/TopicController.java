package com.raghavs.demo2_project;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/topics")
public class TopicController {
     
    @Autowired
    private TopicService topicService;

    @GetMapping
    public List<Topic> getAll()
    {
        return topicService.geTopics();
    }
    @GetMapping("/{id}")
    public Topic getById(@PathVariable int id)
    {
        return topicService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody Topic topic)
    {
        topicService.save(topic);
    }

    @PutMapping("/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable int id)
    {
        topicService.updateTopic(topic, id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable int id)
    {
        topicService.deleteTopic(id);
    }
    
}
