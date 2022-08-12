package project8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		
      Map<Integer,String> m=new LinkedHashMap<Integer,String>();
      m.put(100,"apple");
      m.put(27, "banana");
      m.put(0,"cherry");
      
      
	
	 for(Map.Entry m1:m.entrySet()){  
		   System.out.println(m1.getKey()+" "+m1.getValue());  
		  }  


	}
}
