package com.simplilearn.emailvalidation;
import java.util.Scanner;
public class EmailValidation {

	static boolean isValid(String email)
	{
		String s="^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(s);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your email");
	String email=sc.nextLine();
	System.out.println("The email id you entered is"+" " +isValid(email));
	}
}
