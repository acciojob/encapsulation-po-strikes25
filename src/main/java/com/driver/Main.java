package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj_ect = new RWOnly();
        /* obj_ect.name = "Shilpi";
        System.out.println(obj_ect.name); // Error : name has private access in com.driver.RWOnly
        */

        System.out.println(obj_ect.setter("Shilpi")); //  setter() to set the value of the private variable
        System.out.println(obj_ect.getter()); // getter() to access the private variable

    }
}
