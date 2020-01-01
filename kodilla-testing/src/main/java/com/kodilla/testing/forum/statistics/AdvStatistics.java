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

         this.usersTotal = statistics.usersNames().size();
         this.postsTotal = statistics.postsCount();
         this.commentsTotal = statistics.commentsCount();
         this.avgPosts = calcAvgPosts();
         this.avgComments = calcAvgComments();
         this.commentPerPost = calcCommentPerPost();
     }

     private double calcCommentPerPost(){
        if(statistics.postsCount() > 0 ){
           return  (double) statistics.commentsCount() / statistics.postsCount();
        } else {
            return 0;
        }
     }

     private double calcAvgComments(){
        if(statistics.usersNames().size() > 0){
            return (double) statistics.commentsCount() / statistics.usersNames().size();
        } else {
            return 0;
        }
     }

     private double calcAvgPosts(){
        if(statistics.usersNames().size() > 0){
           return  (double) statistics.postsCount() / statistics.usersNames().size();
        } else {
            return 0;
        }
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
        System.out.println("Forum statistics:");
        System.out.println("Number of users: " + getUsersTotal());
        System.out.println("Number of posts: " + getPostsTotal());
        System.out.println("Number of comments: " + getCommentsTotal());
        System.out.println("Average number of posts per user: " + getAvgPosts());
        System.out.println("Average number of comments per user: " + getAvgComments());
        System.out.println("Average number of comments per post: " + getCommentPerPost());
        System.out.println();
     }



}
