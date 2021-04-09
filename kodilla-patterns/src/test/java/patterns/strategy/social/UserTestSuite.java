package patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strategy.social.*;
import strategy.social.publisher.TwitterPublisher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Hemerald");
        User andrew = new YGeneration("Andrew Jackson");
        User steven = new ZGeneration("Steven Seagal");

        //When
        String johnSharePost = john.sharePost();
        System.out.println("Jonh posted : " + johnSharePost);
        String andrewSharePost = andrew.sharePost();
        System.out.println("Andrew posted : " + andrewSharePost);
        String stevenSharePost = steven.sharePost();
        System.out.println("Steven posted : " + stevenSharePost);
        //Then
        Assertions.assertEquals("SnapchatPublisher", johnSharePost);
        Assertions.assertEquals("TwitterPublisher", andrewSharePost);
        Assertions.assertEquals("FacebookPublisher", stevenSharePost);
    }
    @Test
    void testIndividualSharingStrategy(){
        //Given
        User john = new Millenials("John Hemerald");
        //When
        String johnSharePost = john.sharePost();
        System.out.println("Jonh posted : " + johnSharePost);
        john.setSocialPublisher(new TwitterPublisher());
        johnSharePost = john.sharePost();
        System.out.println("New post by John : " + johnSharePost);

        //Then
        Assertions.assertEquals("TwitterPublisher",johnSharePost);
    }
}
