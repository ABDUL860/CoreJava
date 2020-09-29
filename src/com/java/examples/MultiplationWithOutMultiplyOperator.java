package com.java.examples;

import java.util.Scanner;

public class MultiplationWithOutMultiplyOperator 
{
	public static void main(String[] args) 
	{
		// Take number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int x = sc.nextInt();
		System.out.println("Given Input Nuber is:"+x);
		sc.close();
		// Multiply with 2
		int y = x>>1;
		System.out.println("Multiply with 2:"+y);
		// Multiply with 4
		int z = x<<2;
		System.out.println("Multiply with 4:"+z);
	}

}
