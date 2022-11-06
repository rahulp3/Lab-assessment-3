package com.gl.controller;

import java.util.Scanner;

import com.gl.services.BracketsCheck;

public class Driver {
	public static void main(String[] args) {

		BracketsCheck bc = new BracketsCheck();
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean result = bc.check(input);

		if (result) {
			System.out.println("The entered string contains balanced brackets");
		} else {
			System.out.println("The entered string does not contain balances brackets");
		}
	}

}
