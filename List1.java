package project8;
import java.io.*;
import java.util.*;

public class List1 {

	public static void main(String[] args) {
		 List<String> l=new ArrayList<String>();  

		l.add("ruk");
		l.add(0,"mus");
		l.add(1,"key");
		for(String s:l)
		System.out.println(s);
		
		List<String> al=Collections.unmodifiableList(l);
		
		

	}

}
