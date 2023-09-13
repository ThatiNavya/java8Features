package com.normalapproach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface SquareValue1 {
	public int squareIt(int n);
}
class SquareValue1Demo{
	public static void main(String[] args) throws IOException {
		SquareValue1 sq= n->n*n;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number");
		String str1 = br.readLine();
		int input1 = Integer.parseInt(str1);
		System.out.println("The square value of "+input1+"is "+sq.squareIt(input1));
	}

	
}
