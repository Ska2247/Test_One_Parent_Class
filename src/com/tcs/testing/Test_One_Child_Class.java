package com.tcs.testing;

public class Test_One_Child_Class extends Test_One_Parent_Class {//Run Time Polymorphism

	public void sun() {
		System.out.println("sun shine");
	}

	public void moon() {
		System.out.println("monsoon");
	}

	public void galaxy() {
		System.out.println("the galaxy");
	}

	public static void main(String[] args) {
		Test_One_Child_Class j = new Test_One_Child_Class();
		j.sun();
		j.moon();
		j.galaxy();
	}

}
