package strategy.social.publisher;

import strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "TwitterPublisher";
    }
}
