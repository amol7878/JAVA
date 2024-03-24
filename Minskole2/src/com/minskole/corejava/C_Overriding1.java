package com.minskole.corejava;

public class C_Overriding1 extends P_Overriding1{
	
	public void Marry() {
		System.out.println("Marry with Alia");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Overriding1 ref = new C_Overriding1();
		ref.Marry();
		ref.Marry();
		P_Overriding1 ref1= new P_Overriding1();
		ref1.Marry();
	}

}
