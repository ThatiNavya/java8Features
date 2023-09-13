package com.normalapproach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Addition {
	public void add(int a, int b);
}

class AdditionDemo {
	public static void main(String[] args) throws IOException {
		Addition ad = (a, b) -> System.out.println("The sum of" + a + "," + b + "=" + (a + b));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number a");
		String str1 = br.readLine();
		int input1 = Integer.parseInt(str1);

		System.out.println("Enter the number bd");
		String str2 = br.readLine();

		int input2 = Integer.parseInt(str2);
		ad.add(input1, input2);
	}
}
