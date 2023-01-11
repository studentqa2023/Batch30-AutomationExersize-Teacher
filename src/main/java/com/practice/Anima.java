package com.practice;

public class Anima {
	
	public void getMoney(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Anima obj = new Anima();
		obj.getMoney("Rezwan");
	}

}
