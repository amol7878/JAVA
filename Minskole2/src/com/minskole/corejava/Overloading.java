package com.minskole.corejava;

public class Overloading {

	
	public void teacher() {//compile time polymorphism
		
	System.out.println("Silent");
	}
	
	public void teacher(String school) {
		System.out.println("angry");
	}
	
	public void teacher(int salary) {
		System.out.println("Happpy");
	}
	
	
	public static void main(String[] args) {
		Overloading ref =new Overloading();
		ref.teacher();
		ref.teacher(1000);
		ref.teacher("Amol");

	}

}
