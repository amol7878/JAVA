package com.minskole.corejava;

public class Overloading1 {// Overloading Polymorphism
	public void teacher() {
	System.out.println("Silent");	
	}
	public void teacher(String school) {
		System.out.println("Angry");
	}
	public void teacher(int salary) {
		System.out.println("Happy");
	}
	

	public static void main(String[] args) {
	
		Overloading1 ref =new Overloading1();
		ref.teacher();
		ref.teacher(1000);
		
		ref.teacher("amol");
	

	}

}
