package com.minskole.corejava;

public class Son extends Parent {

	public void pen() {
		System.out.println("Pen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son ref = new Son();
		ref.farm();
		ref.pen();
	}

}
