package com.kodilla.testing.forum.statistics;


public class AdvStatistics {
    Statistics statistics;
    int usersTotal;
    int postsTotal;
    int commentsTotal;
    double avgPosts;
    double avgComments;
    double commentPerPost;

    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }



    public void  calculateAdvStatistics(Statistics statistics){

         int usersTotal = statistics.usersNames().size();
         int postsTotal = statistics.postsCount();
         int commentsTotal = statistics.commentsCount();
         double avgPosts = statistics.postsCount() / statistics.usersNames().size();
         double avgComments = statistics.commentsCount() / statistics.usersNames().size();
         double commentPerPost = statistics.commentsCount() / statistics.postsCount();
     }

    public int getUsersTotal() {
        return usersTotal;
    }

    public int getPostsTotal() {
        return postsTotal;
    }

    public int getCommentsTotal() {
        return commentsTotal;
    }

    public double getAvgPosts() {
        return avgPosts;
    }

    public double getAvgComments() {
        return avgComments;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }

    public void showStatistics(){
         System.out.println("Brak");

     }



}
