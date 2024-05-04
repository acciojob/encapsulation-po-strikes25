package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        /*
        rw.name = "Shilpi";
        System.out.println(rw.name); */

        rw.setter("Shilpi");
        System.out.println(rw.getter());
    }
}
