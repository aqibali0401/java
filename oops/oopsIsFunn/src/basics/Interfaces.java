package basics;

import java.util.ArrayList;

public class Interfaces implements Car, Person {
	public static void main(String[] args) {
		
		
		
		 
		
	}

	@Override
	public void start() {
		System.out.println("my car is starting");
		
	}

	@Override
	public void Walk() {
		System.out.println("i am person also");
		
	}
}


interface Car {
	
	void start();
	
}

interface Person {
	void Walk();
}