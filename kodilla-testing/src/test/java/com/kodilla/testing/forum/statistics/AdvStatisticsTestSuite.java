package com.kodilla.testing.forum.statistics;

import javafx.beans.binding.When;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin.\n");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end.\n");
    }

    @Before
    public void before(){
        System.out.println("Test Case: begin.\n");
    }

    @After
    public void after(){
        System.out.println("Test Case: end.\n");
    }

    @Test
    public void testCalculateAdvStatisticsZeroPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Andrzej");
        usersList.add("Kasia");
        usersList.add("Franek");
        usersList.add("Iga");

        int postNumber = 0;
        int commentNumber = 5;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        advStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = advStatistics.getUsersTotal();
        int quantityOfPosts = advStatistics.getPostsTotal();
        int quantityOfComments = advStatistics.getCommentsTotal();
        double quantityOfAvgPosts = advStatistics.getAvgPosts();
        double quantityOfAvgComments = advStatistics.getAvgComments();
        double quantityOfCommentsPerPost = advStatistics.getCommentPerPost();

        //Then
        Assert.assertEquals(4,quantityOfUsers);
        Assert.assertEquals(0,quantityOfPosts);
        Assert.assertEquals(5,quantityOfComments);
        Assert.assertEquals(0,quantityOfAvgPosts,0.1);
        Assert.assertEquals(1.25,quantityOfAvgComments,0.1);
        Assert.assertEquals(0,quantityOfCommentsPerPost,0.1);

        advStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsThousandPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();

            usersList.add("Andrzej");
            usersList.add("Kasia");
            usersList.add("Franek");
            usersList.add("Iga");


        int postNumber = 1000;
        int commentNumber = 5;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        advStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = advStatistics.getUsersTotal();
        int quantityOfPosts = advStatistics.getPostsTotal();
        int quantityOfComments = advStatistics.getCommentsTotal();
        double quantityOfAvgPosts = advStatistics.getAvgPosts();
        double quantityOfAvgComments = advStatistics.getAvgComments();
        double quantityOfCommentsPerPost = advStatistics.getCommentPerPost();

        //Then
        Assert.assertEquals(4,quantityOfUsers);
        Assert.assertEquals(1000,quantityOfPosts);
        Assert.assertEquals(5,quantityOfComments);
        Assert.assertEquals(250,quantityOfAvgPosts,0.1);
        Assert.assertEquals(1.25,quantityOfAvgComments,0.1);
        Assert.assertEquals(0,quantityOfCommentsPerPost,0.1);

        advStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsZeroComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Andrzej");
        usersList.add("Kasia");
        usersList.add("Franek");
        usersList.add("Iga");

        int postNumber = 6;
        int commentNumber = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        advStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = advStatistics.getUsersTotal();
        int quantityOfPosts = advStatistics.getPostsTotal();
        int quantityOfComments = advStatistics.getCommentsTotal();
        double quantityOfAvgPosts = advStatistics.getAvgPosts();
        double quantityOfAvgComments = advStatistics.getAvgComments();
        double quantityOfCommentsPerPost = advStatistics.getCommentPerPost();

        //Then
        Assert.assertEquals(4,quantityOfUsers);
        Assert.assertEquals(6,quantityOfPosts);
        Assert.assertEquals(0,quantityOfComments);
        Assert.assertEquals(1.5,quantityOfAvgPosts,0.1);
        Assert.assertEquals(0,quantityOfAvgComments,0.1);
        Assert.assertEquals(0,quantityOfCommentsPerPost,0.1);

        advStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsCommentsMorePosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Andrzej");
        usersList.add("Kasia");
        usersList.add("Franek");
        usersList.add("Iga");

        int postNumber = 10;
        int commentNumber = 20;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        advStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = advStatistics.getUsersTotal();
        int quantityOfPosts = advStatistics.getPostsTotal();
        int quantityOfComments = advStatistics.getCommentsTotal();
        double quantityOfAvgPosts = advStatistics.getAvgPosts();
        double quantityOfAvgComments = advStatistics.getAvgComments();
        double quantityOfCommentsPerPost = advStatistics.getCommentPerPost();

        //Then
        Assert.assertEquals(4,quantityOfUsers);
        Assert.assertEquals(10,quantityOfPosts);
        Assert.assertEquals(20,quantityOfComments);
        Assert.assertEquals(2.5,quantityOfAvgPosts,0.1);
        Assert.assertEquals(5,quantityOfAvgComments,0.1);
        Assert.assertEquals(2,quantityOfCommentsPerPost,0.1);

        advStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsPostsMoreComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Andrzej");
        usersList.add("Kasia");
        usersList.add("Franek");
        usersList.add("Iga");

        int postNumber = 20;
        int commentNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        advStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = advStatistics.getUsersTotal();
        int quantityOfPosts = advStatistics.getPostsTotal();
        int quantityOfComments = advStatistics.getCommentsTotal();
        double quantityOfAvgPosts = advStatistics.getAvgPosts();
        double quantityOfAvgComments = advStatistics.getAvgComments();
        double quantityOfCommentsPerPost = advStatistics.getCommentPerPost();

        //Then
        Assert.assertEquals(4,quantityOfUsers);
        Assert.assertEquals(20,quantityOfPosts);
        Assert.assertEquals(10,quantityOfComments);
        Assert.assertEquals(5,quantityOfAvgPosts,0.1);
        Assert.assertEquals(2.5,quantityOfAvgComments,0.1);
        Assert.assertEquals(0.5,quantityOfCommentsPerPost,0.1);

        advStatistics.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();


        int postNumber = 10;
        int commentNumber = 20;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        advStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = advStatistics.getUsersTotal();
        int quantityOfPosts = advStatistics.getPostsTotal();
        int quantityOfComments = advStatistics.getCommentsTotal();
        double quantityOfAvgPosts = advStatistics.getAvgPosts();
        double quantityOfAvgComments = advStatistics.getAvgComments();
        double quantityOfCommentsPerPost = advStatistics.getCommentPerPost();

        //Then
        Assert.assertEquals(0,quantityOfUsers);
        Assert.assertEquals(10,quantityOfPosts);
        Assert.assertEquals(20,quantityOfComments);
        Assert.assertEquals(0,quantityOfAvgPosts,0.1);
        Assert.assertEquals(0,quantityOfAvgComments,0.1);
        Assert.assertEquals(2,quantityOfCommentsPerPost,0.1);

        advStatistics.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsThousandUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for(int n = 0; n < 250; n++) {
            usersList.add("Andrzej");
            usersList.add("Kasia");
            usersList.add("Franek");
            usersList.add("Iga");
        }

        int postNumber = 100;
        int commentNumber = 100;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        advStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfUsers = advStatistics.getUsersTotal();
        int quantityOfPosts = advStatistics.getPostsTotal();
        int quantityOfComments = advStatistics.getCommentsTotal();
        double quantityOfAvgPosts = advStatistics.getAvgPosts();
        double quantityOfAvgComments = advStatistics.getAvgComments();
        double quantityOfCommentsPerPost = advStatistics.getCommentPerPost();

        //Then
        Assert.assertEquals(1000,quantityOfUsers);
        Assert.assertEquals(100,quantityOfPosts);
        Assert.assertEquals(100,quantityOfComments);
        Assert.assertEquals(0.1,quantityOfAvgPosts,0.01);
        Assert.assertEquals(0.1,quantityOfAvgComments,0.01);
        Assert.assertEquals(1,quantityOfCommentsPerPost,0.1);

        advStatistics.showStatistics();
    }

}
