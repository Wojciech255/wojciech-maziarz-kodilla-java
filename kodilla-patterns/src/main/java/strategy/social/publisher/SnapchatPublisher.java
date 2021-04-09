package strategy.social.publisher;

import strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "SnapchatPublisher";
    }
}
