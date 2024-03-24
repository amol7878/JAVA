package com.minskole.corejava;

public class Truck extends Vehical{

	public static void main(String[] args) {
		Truck ref = new Truck();
  ref.tyre();
  ref.speed();
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("70 km /hr");
	}

}
