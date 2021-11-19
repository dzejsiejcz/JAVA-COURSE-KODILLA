package com.kodilla.testing.statistics;

public class CalculateStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public CalculateStatistics(int usersQuantity, int postsQuantity, int commentsQuantity, double averagePostsPerUser, double averageCommentsPerUser, double averageCommentsPerPost) {
        this.usersQuantity = usersQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
        this.averagePostsPerUser = averagePostsPerUser;
        this.averageCommentsPerUser = averageCommentsPerUser;
        this.averageCommentsPerPost = averageCommentsPerPost;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if (usersQuantity !=0){
            double temp = (double)postsQuantity / (double)usersQuantity;
            temp = Math.round(temp*100);
            averagePostsPerUser = temp/100;
        } else {
            averagePostsPerUser = 0;
        }
        if (usersQuantity !=0){
            double temp = (double)commentsQuantity / (double)usersQuantity;
            temp = Math.round(temp*100);
            averageCommentsPerUser = temp/100;
        } else {
            averageCommentsPerUser = 0;
        }
        if (postsQuantity !=0) {
            double temp = (double)commentsQuantity / (double)postsQuantity;
            temp = Math.round(temp*100);
            averageCommentsPerPost = temp/100;
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public String showStatistics() {
        return "Quantity of users: " + usersQuantity + ". \n Quantity of posts: " + postsQuantity + ". \n Quantity of comments: " + commentsQuantity +
                ". \n Average posts per user: "+averagePostsPerUser+". \n Average comments per user: "+averageCommentsPerUser+
                ". \n Average comments per post: "+averageCommentsPerPost;
    }
}
