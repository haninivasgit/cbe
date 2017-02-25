package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<String>();

        // populates list with initial values
        for (String i : Arrays.asList("1","2","3","4","5","6","7"))
        	strings.add(i);
        
        
       
        
        for (int index=0; index < strings.size(); index++) {
        	 StringJoiner joiner = new StringJoiner(",");
        	joiner.add(strings.get(index));
            int next = ++index ;
            if ( next < strings.size())
            	joiner.add(strings.get(next));
            System.out.println( joiner.toString());
        }
        
	}

}
