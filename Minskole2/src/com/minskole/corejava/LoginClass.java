package com.minskole.corejava;

import java.util.Scanner;

public class LoginClass implements LoginPage{
String name;
String pass;


	public void input() {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		name =ref.nextLine();
		System.out.println("Enter your Pass: ");
		pass=ref.nextLine();
		
	}

	
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("Login Successfully");
		
	}
	
	public static void main(String []args) {
		LoginClass lp= new LoginClass();
		lp.input();
		lp.output();
	}

}
