package com.mywebsite.module.security;

import com.mywebsite.module.login.demo3;

public class demo2 {
	
	public static void main(String[] args) {
		System.out.println("From main method");
		demo3 demo3=new demo3();
	}
	static {
		System.out.println("From static block1");
	}
	static {
		System.out.println("From static block2");
	}
}
