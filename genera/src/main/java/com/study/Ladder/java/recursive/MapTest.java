package com.study.Ladder.java.recursive;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	static Map<String,String> map=new HashMap<String,String>();  
    public MapTest() {  
          
    }  
    public static void main(String[] args) {  
    	MapTest test = new MapTest();
    	System.out.println(test.recursive(10));
    }  
    
    int recursive(int i)
    {
    	int sum = 0;
    	if (0 == i)
    		return (1);
    	else
    		sum = i * recursive(i-1);
    	System.out.println(i+"ГЫвд"+(i-1));
    	return sum;
    }
    
    boolean comparaMap(){
    	Map<String,String> mapOne = new LinkedHashMap<String, String>();
    	mapOne.put("1", "test");
    	Map<String,String> mapTwo = new LinkedHashMap<String, String>();
    	return false;
    }
}
