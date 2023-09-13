package com.normalapproach;

interface Interf {
	public void m1();
}

class TestInterf {
	public static void main(String[] args) {
		Interf i = () -> System.out.println("LambdaExpressions...");
		i.m1();

	}
}
