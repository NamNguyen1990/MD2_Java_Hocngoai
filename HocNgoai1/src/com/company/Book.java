package com.company;

public class Book {
    public int a = 1;
    public static int b;


    public static void in () {
        b = 2;
        Book book1 = new Book();
        System.out.println(book1.a);
    }

    public void main(String[] args) {
        System.out.println(b);
    }


}


