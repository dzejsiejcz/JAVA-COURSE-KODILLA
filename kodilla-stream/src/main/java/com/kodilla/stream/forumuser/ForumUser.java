package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public  class ForumUser {

    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirthDate;
    private final int quantityCommentsOfUser;

    public ForumUser(final int userId,final String userName,final char userSex,final LocalDate userBirthDate,final int quantityCommentsOfUser) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthDate = userBirthDate;
        this.quantityCommentsOfUser = quantityCommentsOfUser;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getQuantityCommentsOfUser() {
        return quantityCommentsOfUser;
    }

    @Override
    public String toString() {
        return "UserName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBirthDate=" + userBirthDate +
                ", quantityCommentsOfUser=" + quantityCommentsOfUser +
                '}';
    }
}
