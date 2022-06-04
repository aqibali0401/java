package basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

	public static void main(String args[]){  
		
		HashMap<Integer,String> aqib =new HashMap<Integer,String>();//Creating HashMap    
		aqib.put(1,"Mango");  //Put elements in Map  
		aqib.put(2,"Apple");    
		aqib.put(3,"Banana");   
		aqib.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   
		   for(Map.Entry a : aqib.entrySet()){    
		    System.out.println(a.getKey()+" "+ a.getValue());    
		   }  
		   
	    aqib.putIfAbsent(103, "Gaurav");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry m:aqib.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
          }  
	      
	      
	      aqib.remove(1);  
	      System.out.println("Updated list of elements: "+aqib);  
	      
	      aqib.replace(103, "aqib");  

	      System.out.println("Updated list of elements after replace: "+aqib);
		
	}
	
}
