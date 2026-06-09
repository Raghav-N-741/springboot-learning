package com.raghavs.demo2_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    public List<Topic> topics= new ArrayList<>(Arrays.asList(
       new Topic(1,"Raghav"),
       new Topic(5,"N")
    ));

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> geTopics()
    {
        return topicRepository.findAll();
    }

    public Topic getById(int id)
    {

        return topicRepository.findById(id).orElse(null);
        // for(Topic t: topics)
        // {
        //     if(t.getId()==id)
        //     {
        //         return t;
        //     }
        // }
        // return null;
    }

    public void save(Topic topic)
    {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic,int id)
    {
        topicRepository.save(topic);
        // for(int i=0;i<topics.size();i++)
        // {
        //     if(topics.get(i).getId()==id)
        //     {
        //         topics.set(i, topic);
        //         break;
        //     }
        // }
    }

    public void deleteTopic(int id)
    {
        topicRepository.deleteById(id);
        //topics.removeIf(t -> t.getId()==id);
    }
}
