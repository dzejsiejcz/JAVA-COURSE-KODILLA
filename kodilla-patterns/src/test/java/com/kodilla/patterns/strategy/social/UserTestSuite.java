package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User mike = new Millenials("Mike");
        User dave = new YGeneration("David");
        User steve = new ZGeneration("Steven");


        //When
        String mikePost = mike.sharePost();
        System.out.println("Post of Mike: " + mikePost);

        String davePost = dave.sharePost();
        System.out.println("Post of Dave: " + davePost);

        String stevePost = steve.sharePost();
        System.out.println("Post of Steve: " + stevePost);


        //Then
        assertEquals("New post on Facebook", mikePost);
        assertEquals("New post in Twitter", davePost);
        assertEquals("New post in Snapchat", stevePost);


    }


    @Test
    void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike");

        //When

        String mikePost = mike.sharePost();
        System.out.println("Post of Mike: " + mikePost);

        mike.setSocialPublisher(new TwitterPublisher());
        mikePost = mike.sharePost();
        System.out.println("Post of Mike in new media: " + mikePost );

        //Then
        assertEquals("New post in Twitter", mikePost);


    }


}
