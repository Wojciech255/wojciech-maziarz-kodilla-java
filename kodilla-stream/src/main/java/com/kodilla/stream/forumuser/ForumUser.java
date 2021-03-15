package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    final int iD;
    final String userName;
    final char sex;
    final LocalDate dateOfBirth;
    final int numberOfPost;

    public ForumUser(int iD, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPost) {
        this.iD = iD;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPost = numberOfPost;
    }

    public int getiD() {
        return iD;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "iD=" + iD +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}


