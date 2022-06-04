package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import encapsulation.Encapsulation;

public class MainClass {

	public static void main(String[] args) {
//		System.out.println("hello world");
		
//		Person p1 = new Person();
//		p1.age=22;
//		p1.name = "Aqib";
//		
//		Person p2 = new Person(31, "Rahul");
//		p2.age=31;
//		p2.name = "Rahul";
		
//		System.out.println(p1.age + " " +  p1.name);
//		System.out.println(p2.age + " " +  p2.name);
		
//		p1.eat();
//		p2.walk();
//		p1.walk(2);
//		
//		System.out.println(Person.count);
		
//		Developer d1 = new Developer(24,"sarthak");
//		d1.walk(5);
		
//		Encapsulation obj = new Encapsulation();
//		obj.doWork();
		
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      //Printing the arraylist object   
//	      System.out.println(list);  
	      
	      // --> itrating using itrato
	      
//	      Iterator itr = list.iterator();
//	      while(itr.hasNext()) {
//	    	  System.out.println(itr.next());
//	      }
	      
	   // --> itrating using for each loop
//	      
//	      for(String fruit : list) {
//	    	  System.out.println(fruit);
//	      }
//    ---------------------------------------------------------------
//	      Get and Set ArrayList
	      
//	      System.out.println(list.get(0));
	      
//	      list.set(1,"aqib");
//	      System.out.println(list );
	      
//	      ------------------------------------------------------------
//	 The java.util package provides a utility class Collections, which has the static method sort(). 
//	   Using the Collections.sort() method, we can easily sort the ArrayList.
	      
//	      Collections.sort(list);
//	      System.out.println(list);
	      
//----------------------------------------------------------------------
//	      for(int i=0;i<list.size();i++)  
//          {  
//           System.out.println(list.get(i));     
//          }  

 //---------------------------------------------------------------------- 
//	      list.forEach(a->{ //Here, we are using lambda expression  
//              System.out.println(a);  
//            });  
	      
//---------------------------------------------------------------------------
	      Iterator<String> itr=list.iterator();  
          itr.forEachRemaining(a-> //Here, we are using lambda expression  
          {  
        	  System.out.println(a);  
          });  
	      
	      
	      
	      
	      
	      
	      
		
	}
	
}

class Developer extends Person {
	
	public Developer(int age, String name) {
		super(age, name);
	}
	void walk(int steps) {
		System.out.println("Developer " + name + " walked "+ steps + " steps");
	}
	
}


class Person {
	protected String name;
	int age;
	static int count;
	
	public Person() {
		count++;
		System.out.println("creating new object");
	}
	
	public Person(int age, String name) {
		 
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	void eat() {
		System.out.println(name + " is eating.");
	}
	void walk(int steps) {
		System.out.println(name + " walked "+ steps + " steps");
	}
	void doWork() {
		System.out.println("Person is working");
	}
	
}









