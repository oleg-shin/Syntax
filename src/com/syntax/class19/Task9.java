package com.syntax.class19;
    class Book{
    String author;
    int pageCount;
    Book(String author){
        this.author = author;
    }
    Book(String author, int pageCount){
        this.author = author;
        this.pageCount = pageCount;
    }
}
public class Task9 {
    public static void main(String[] args) {
        Book b = new Book("Hemingay");
        Book c = new Book("Bla", 10);
    }
}
