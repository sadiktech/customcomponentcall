package com.sadik.custom;

import java.util.HashMap;
import java.util.Map;

public class CustomComponent {
	
	public Map<String,String> getMapReturnValue (){
		Map<String, String> output = new HashMap<String,String>();
		output.put("executedMathod", "getMapReturnValue");
		return output;
		
	}
	
	public Map<String,String> getStringReturnValue(){
		Map<String, String> output = new HashMap<String,String>();
		output.put("executedMathod", "getStringReturnValue");
		
		return output;
	}
	
	

}
