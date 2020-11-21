package com.example.mybookapp;

public class Book {
    private String BookImage;
    private String UserName;
    private String UserEmail;
    private String BookTitle;

    public String getBookImage() {
        return BookImage;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public String getUserName() {
        return UserName;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setBookImage(String bookImage) {
        BookImage = bookImage;
    }
}
