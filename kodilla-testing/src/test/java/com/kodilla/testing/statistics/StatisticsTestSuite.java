package com.kodilla.testing.statistics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private static int testCounter = 0;

    @Mock
    private Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @BeforeEach
    public void beforeEveryTests() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testEmptyListOfPosts () {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(0,0,0,0,0,0);
        List<String> resultUserNames = generateListOfUsers(3);
        int resultPostQuantity = 0;
        int resultCommentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(resultUserNames);
        when(statisticsMock.postsCount()).thenReturn(resultPostQuantity);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsQuantity);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(3, calculateStatistics.getUsersQuantity());
        assertEquals(0, calculateStatistics.getPostsQuantity());
        assertEquals(0, calculateStatistics.getCommentsQuantity());
        assertEquals(0.0, calculateStatistics.getAveragePostsPerUser());
        assertEquals(0.0, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0.0, calculateStatistics.getAverageCommentsPerPost());
        System.out.println(calculateStatistics.showStatistics());
    }
    @Test
    void testListOf1000Posts () {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(0,0,0,0,0,0);
        List<String> resultUserNames = generateListOfUsers(3);
        int resultPostQuantity = 1000;
        int resultCommentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(resultUserNames);
        when(statisticsMock.postsCount()).thenReturn(resultPostQuantity);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsQuantity);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(3, calculateStatistics.getUsersQuantity());
        assertEquals(1000, calculateStatistics.getPostsQuantity());
        assertEquals(0, calculateStatistics.getCommentsQuantity());
        assertEquals(333.33, calculateStatistics.getAveragePostsPerUser());
        assertEquals(0.0, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0.0, calculateStatistics.getAverageCommentsPerPost());
        System.out.println(calculateStatistics.showStatistics());
    }

    @Test
    void testEmptyListOfComments () {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(0,0,0,0,0,0);
        List<String> resultUserNames = generateListOfUsers(3);
        int resultPostQuantity = 10;
        int resultCommentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(resultUserNames);
        when(statisticsMock.postsCount()).thenReturn(resultPostQuantity);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsQuantity);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(3, calculateStatistics.getUsersQuantity());
        assertEquals(10, calculateStatistics.getPostsQuantity());
        assertEquals(0, calculateStatistics.getCommentsQuantity());
        assertEquals(3.33, calculateStatistics.getAveragePostsPerUser());
        assertEquals(0.0, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0.0, calculateStatistics.getAverageCommentsPerPost());
        System.out.println(calculateStatistics.showStatistics());
    }
    @Test
    void testPostsMoreThanComments () {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(0,0,0,0,0,0);
        List<String> resultUserNames = generateListOfUsers(3);
        int resultPostQuantity = 100;
        int resultCommentsQuantity = 50;

        when(statisticsMock.usersNames()).thenReturn(resultUserNames);
        when(statisticsMock.postsCount()).thenReturn(resultPostQuantity);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsQuantity);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(3, calculateStatistics.getUsersQuantity());
        assertEquals(100, calculateStatistics.getPostsQuantity());
        assertEquals(50, calculateStatistics.getCommentsQuantity());
        assertEquals(33.33, calculateStatistics.getAveragePostsPerUser());
        assertEquals(16.67, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0.5, calculateStatistics.getAverageCommentsPerPost());
        System.out.println(calculateStatistics.showStatistics());
    }
    @Test
    void testCommentsMoreThanPosts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(0,0,0,0,0,0);
        List<String> resultUserNames = generateListOfUsers(3);
        int resultPostQuantity = 100;
        int resultCommentsQuantity = 150;

        when(statisticsMock.usersNames()).thenReturn(resultUserNames);
        when(statisticsMock.postsCount()).thenReturn(resultPostQuantity);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsQuantity);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(3, calculateStatistics.getUsersQuantity());
        assertEquals(100, calculateStatistics.getPostsQuantity());
        assertEquals(150, calculateStatistics.getCommentsQuantity());
        assertEquals(33.33, calculateStatistics.getAveragePostsPerUser());
        assertEquals(50, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(1.5, calculateStatistics.getAverageCommentsPerPost());
        System.out.println(calculateStatistics.showStatistics());
    }
    @Test
    void testEmptyListOfUsers () {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(0,0,0,0,0,0);
        List<String> resultUserNames = new ArrayList<>();
        int resultPostQuantity = 0;
        int resultCommentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(resultUserNames);
        when(statisticsMock.postsCount()).thenReturn(resultPostQuantity);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsQuantity);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculateStatistics.getUsersQuantity());
        assertEquals(0, calculateStatistics.getPostsQuantity());
        assertEquals(0, calculateStatistics.getCommentsQuantity());
        assertEquals(0, calculateStatistics.getAveragePostsPerUser());
        assertEquals(0, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0, calculateStatistics.getAverageCommentsPerPost());
        System.out.println(calculateStatistics.showStatistics());
    }
    @Test
    void testListOf100Users () {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(0,0,0,0,0,0);
        List<String> resultUserNames = generateListOfUsers(100);
        int resultPostQuantity = 100;
        int resultCommentsQuantity = 150;

        when(statisticsMock.usersNames()).thenReturn(resultUserNames);
        when(statisticsMock.postsCount()).thenReturn(resultPostQuantity);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsQuantity);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, calculateStatistics.getUsersQuantity());
        assertEquals(100, calculateStatistics.getPostsQuantity());
        assertEquals(150, calculateStatistics.getCommentsQuantity());
        assertEquals(1, calculateStatistics.getAveragePostsPerUser());
        assertEquals(1.5, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(1.5, calculateStatistics.getAverageCommentsPerPost());
        System.out.println(calculateStatistics.showStatistics());
    }

    private List<String> generateListOfUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String user = "name " + n;
            resultList.add(user);
        }
        return resultList;
    }


}
