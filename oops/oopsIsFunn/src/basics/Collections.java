package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collections {
	public static void main(String[] args) {
		//1.  ArrayList --------------------------------------
//		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//		list.add("Ravi");//Adding object in arraylist  
//		list.add("Vijay");  
//		list.add("Ravi");  
//		list.add("Ajay");  
//		//Traversing list through Iterator  
//		for(String s : list) {
//			System.out.println(s);
//		}
//		
		

		//2.  LinkedList --------------------------------------
//		LinkedList<String> al=new LinkedList<String>();  
//		al.add("Ravi");  
//		al.add("Vijay");  
//		al.add("Ravi");  
//		al.add("Ajay");  
//		Iterator<String> itr=al.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
		
//		3. Vector ----------------------------------------------
		
//		Vector<String> v=new Vector<String>();  
//		v.add("Ayush");  
//		v.add("Amit");  
//		v.add("Ashish");  
//		v.add("Garima");  
//		Iterator<String> itr=v.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
		
		
//		4. Stack -------------------------------------------------
		
		 Stack<String> animals= new Stack<>();

	        animals.push("Lion");
	        animals.push("Dog");
	        animals.push("Horse");
	        animals.push("Cat");

	        System.out.println("Stack: " + animals);

	        System.out.println(animals.peek());

	        animals.pop();

	        System.out.println("Stack: " + animals);

	        System.out.println(animals.peek());
		
		
		
		
		
		
		
		
		}  		
 
}
