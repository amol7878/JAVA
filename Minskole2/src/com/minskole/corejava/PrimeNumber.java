package com.minskole.corejava;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		//13 -1   " 2,3,4,5,6,7,8,9,10,11,12" 13
		
		// is num 13 is divisible by 2
		//
      System.out.println(13/2);
      System.out.println(13%2);
      
      if(13%2 == 0) {
    	  System.out.println("13 is divisible by 2 hence its not aprime number");
      }
      else {
    	  System.out.println("13 is not divisible by 2 hence its a prime number");
      }
	}

}
