package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

public class TopicService {

    List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Spring Framework Description"),
            new Topic("javaScript", "Core Java", "Spring Framework Description")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


}
