package com.raghavs.demo_project.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.raghavs.demo_project.model.Topic;

@Service
public class TopicService {
    List<Topic> topics=new ArrayList<>(Arrays.asList(
            new Topic("spring","11","i am the one"),
            new Topic("boot","101","The  next"),
            new Topic("Raggs","hehe","the last one")));

    public List<Topic> getAllTopics()
    {return topics;}

    public Topic getTopic(String id)
    {
        //topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        for(Topic t: topics)
        {
            if(t.getId().equals(id)) return t;
        }
        return null;
    }
    
    public void addTopic(Topic topic)
    {
        topics.add(topic);
    }

    public void updateTopic(Topic topic,String id)
    {
        for(int i=0;i<topics.size();i++)
        {
            Topic t=topics.get(i);
            if(t.getId().equals(id))
            {
                topics.set(i,topic);
                return;
            }
        }
        // for(Topic t : topics)
        // {
        //     if(t.getId().equals(id))
        //     {
        //         t.setName(topic.getName());
        //         t.setAbout(topic.getAbout());
        //         t.setId(topic.getId());
        //         return;
        //     }
        // }
    }

    public void deleteTopic(String id)
    {
        topics.removeIf(t -> t.getId().equals(id));
    }




}
