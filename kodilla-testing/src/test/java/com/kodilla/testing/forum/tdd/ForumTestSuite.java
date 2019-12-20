package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest(){
        System.out.println("This is beginning of the tests.");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished.");
    }

    @Before
    public  void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("Lach","Andrzej Nerwowy");

        //When
        forumUser.addPost("Lach","Hello everyone, this is my first post.");

        //Then
        Assert.assertEquals(1,forumUser.getPostQuantity());
    }

    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("Lach","Andrzej Nerwowy");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first post.", "Lach");

        //When
        forumUser.addComment(thePost,"Lach", "Thank you for all good words!");

        //Then
        Assert.assertEquals(1,forumUser.getCommentQuantity());
    }

    @Test
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("Lach","Andrzej Nerwowy");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first post.", "Lach");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(thePost,retrievedPost);

    }

    @Test
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("Lach","Andrzej Nerwory");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first post.","Lach");
        ForumComment theComment = new ForumComment(thePost,"Thank you for all good words", "Lach");
        forumUser.addComment(thePost,theComment.getAuthor(),theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment,retrievedComment);

    }

    @Test
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("Lach","Andrzej Nerwowy");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first post.","Lach");

        //When
        boolean result = forumUser.removePost(thePost);

        //Taken
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("Lach","Andrzej Nerwowy");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first post.","Lach");
        ForumComment theComment = new ForumComment(thePost,"Thank you for all good words","Lach");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("Lach", "Andrzej Nerwowy");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first post.","Lach");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getPostQuantity());
    }

    @Test
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("Lach","Andrzej Nerwowy");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first post.","Lach");
        ForumComment theComment = new ForumComment(thePost,"Thank you for all good words", "Lach");
        forumUser.addComment(thePost, theComment.getAuthor(),theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Taken
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getCommentQuantity());
    }
}
