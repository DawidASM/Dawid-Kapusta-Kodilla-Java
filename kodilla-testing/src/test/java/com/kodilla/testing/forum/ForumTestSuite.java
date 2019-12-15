package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin.");
    }
    @After
    public void after(){
        System.out.println("Test Case: end.");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin.");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end.");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("Franek", "Franciszek Smuda");
        //When
        String result = simpleUser.getUserName();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("Franek",result);
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("Franek", "Franciszek Smuda");
        //When
        String result = simpleUser.getRealname();
        System.out.println("Testing: " + result);
        //Taken
        Assert.assertEquals("Franciszek Smuda", result);

    }


}
