package mypack;

import mypack.pack.C;

public class A extends C{
	public void show(){
		System.out.println("Class A Demo");
	}
	void show1(){
		System.out.println("Package Demo 1");
	}
	protected void showProtected() {
		System.out.println("Protected method");
	}
	
}