package strategy.social.publisher;

import strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "FacebookPublisher";
    }
}
