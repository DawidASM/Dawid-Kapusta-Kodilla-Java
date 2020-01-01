package com.kodilla.testing.forum.statistics;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Andrzej");
        usersList.add("Kasia");
        usersList.add("Franek");
        usersList.add("Iga");

        int postNumber = 6;
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

        //Then
        Assert.assertEquals(4,quantityOfUsers);
        Assert.assertEquals(6,quantityOfPosts);
        Assert.assertEquals(5,quantityOfComments);

    }
}
