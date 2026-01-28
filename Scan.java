package org.scan;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//creating HashMap and get values and keys by using enhanced for loop 

public class Scan {
	public static void main(String[] args) {
		Map<Integer,String> abd=new HashMap<>();
		
		abd.put(10,"Java");
		abd.put(20,"slenium");
		abd.put(30,"Oracle");
		abd.put(40,"corejava");
		abd.put(50,"jira");
		
	   Set<Entry<Integer, String>> entrySet = abd.entrySet();
	   
	   for(Entry<Integer, String> result : entrySet) {
		   
		   
		      String value = result.getValue();
		      System.out.println(value);
		     
		      
		      Integer key = result.getKey();
		      System.out.println(key);
			
			
		}
		
		
		

		
	}
	}