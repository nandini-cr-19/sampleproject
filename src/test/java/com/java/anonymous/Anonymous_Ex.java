package com.java.anonymous;

interface Greetings{
	void sayHello();
	
}
public class Anonymous_Ex {
	public static void main(String[] args) {
		Greetings greet = new Greetings() {

			@Override
			public void sayHello() {
				System.out.println("Hello from anonymous class");	
			}
		};
		greet.sayHello();
	}

}
