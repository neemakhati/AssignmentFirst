package com.example.navproj;

public class Book {
    private String title;
    private String author;
    private String publication;
    private static Book instance;

    public static Book getInstance(String title, String author, String publication){
        if (null == instance) {
            instance = new Book(title,author,publication);
        }
        return instance;
    }
    public static Book getInstance() {
        return instance;
    }
    private Book(String title, String author, String publication) {
        this.title = title;
        this.author = author;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }
}
