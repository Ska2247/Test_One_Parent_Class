package com.tcs.testing;

public class Test_One_Parent_Class {

	public void sun() {
		System.out.println("the sun");
	}

	public void moon() {
		System.out.println("the moon");
	}

	public static void main(String[] args) {
		Test_One_Parent_Class n = new Test_One_Parent_Class();
		n.sun();
		n.moon();
	}

}
