package org.sample;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample1 {
	public static void main(String[] args) {
		
Map<Integer, String> mp = new LinkedHashMap<>();
		
		mp.put(10, "Inmkes");
		mp.put(40, "HCL");
		mp.put(10, "CTS");
		mp.put(20, "CTS");
		mp.put(30, "TCS");
		mp.put(60, "GOOGLE");
		mp.put(30, "ACCENTURE");
		mp.put(50, "ACCENTURE");
		
		System.out.println(mp);
		
		//to find size of map
		int size = mp.size();
		System.out.println("Map Size : " + size);
		
		//to get the value from map
		String val = mp.get(60);
		System.out.println("Value of 60 : " + val);
		
		//to check key is present or not
		boolean key = mp.containsKey(10);
		System.out.println(key);
		
		//to check value is present or not
		boolean containsValue = mp.containsValue("ACCENTURE");
		System.out.println(containsValue);
		
		//to remove the particular value from map key
		String remove = mp.remove(20);
		System.out.println(remove);
		
		//to clear all the value from map
		mp.clear();
		System.out.println(mp);
		
		//to check whether the map is empty or not
		boolean empty = mp.isEmpty();
		System.out.println(empty);
		
		///////////////////////////
		
		
		mp.put(10, "Inmkes");
		mp.put(40, "HCL");
		mp.put(10, "CTS");
		mp.put(20, "CTS");
		mp.put(30, "TCS");
		mp.put(60, "GOOGLE");
		mp.put(30, "ACCENTURE");
		mp.put(50, "ACCENTURE");
		
		System.out.println(mp);
		
		//to display key only
		Set<Integer> Keys = mp.keySet();
		System.out.println(Keys);
		
		//to display value only
		Collection<String> values = mp.values();
		System.out.println(values);
		
		//to iterate the map
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println(entrySet);
		
		//to didplay corresponding key on
		for (Entry<Integer, String> e : entrySet) {
        Integer key2 = e.getKey();
        System.out.println(key2);
        
        //to display corresponding value
        String value = e.getValue();
        System.out.println(value);
			
		}
			
	}
			
				
	
	}
	
	
