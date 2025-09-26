package com.java.anonymous;

interface Greeting {
    void sayHello();
}

public class Lambda_Ex {
    public static void main(String[] args) {
        Greeting greet =()-> System.out.println("Hello from lambda expression");
        greet.sayHello();
    }
}
