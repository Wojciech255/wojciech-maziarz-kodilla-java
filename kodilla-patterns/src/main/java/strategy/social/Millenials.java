package strategy.social;

import strategy.social.publisher.SnapchatPublisher;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
