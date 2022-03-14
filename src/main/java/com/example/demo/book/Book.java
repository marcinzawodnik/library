package com.example.demo.book;

import javax.persistence.*;

@Entity
public class Book {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int isbn;
    private String title;
    private String authors;

    public Book(Long id, int isbn, String title, String authors){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
    }
    public Book(int isbn, String title, String authors){
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
    }

    public Book() {
    }

    public Long getId(){

        return id;
    }
    public void setId(Long id){

        this.id = id;
    }

    public int getIsbn(){

        return isbn;
    }
    public void setIsbn(int isbn){

        this.isbn = isbn;
    }
    public String getTitle(){

        return title;
    }
    public void setTitle(String title){

        this.title = title;
    }
    public String getAuthors(){

        return authors;
    }
    public void setAuthors(String authors){

        this.authors = authors;
    }
}
