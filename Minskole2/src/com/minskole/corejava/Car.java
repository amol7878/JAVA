package com.minskole.corejava;

public class Car extends Vehical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ref = new Car();
		ref.tyre();
		ref.speed();
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("150 km/hr");
	}

}
