package com.minskole.corejava;

public class This_Keyword {
	public This_Keyword() {
		this(10);
		System.out.println("this is non argument constructor");
	}
	
	
	public This_Keyword(int x) {
		this("this Keyword");
		System.out.println("this is in int statement");
	}
	
	public This_Keyword(String y) {
	
		System.out.println("this is in Stirng statement");
	}
	

	public static void main(String[] args) {
		This_Keyword AS= new This_Keyword();
	}

}
