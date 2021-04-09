package strategy.social;

import strategy.social.publisher.TwitterPublisher;

public class YGeneration extends User{
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
