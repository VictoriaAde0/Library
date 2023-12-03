package com.libraryapp.libProject.dto;

public class Libdto {
    private long id;
    private String title;
    private String author;
    private int isbn;


    public Libdto(){

    }


    public Libdto(long id, String title, String author,int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString () {
        return "Libdto{" +
                ", title= '" + title + '\'' +
                ", author= '" + author + '\'' +
                ", isbn= '" + isbn + '\'' +
                '}';
    }

}
