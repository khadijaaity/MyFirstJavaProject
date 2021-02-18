package com.netmind.exercise;

public class Pares {

	public int sumaDePares() {
		 
		
		int result = 0;
		int[] intArray = new int[100];
		
		for (int i=0 ; i<100 ; i++) {
			intArray[i] = i+1;
		}

		for (int i=0; i<intArray.length; i++) {
		    
		    	if(i % 2 == 0){
		            result += intArray[i];
		        }
		    	
		        
		}
		
		return result;
	    
	    

	}

}
