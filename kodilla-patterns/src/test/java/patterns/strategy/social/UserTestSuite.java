package patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.social.User;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User john = new User("Millenials");

        //When
        String stevenShouldBuy = john.getName();
        //Then
        Assertions.assertEquals("Millenials",stevenShouldBuy);
    }
}
