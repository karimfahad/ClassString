package com.String;

public class Main {

	public static void main(String[] args) {
		
		//privitive datatype
		//byte
		//int
		//float
		//double
		//boolean
		//char
		//short
		//long
		
		String myString = "This is a String";
		System.out.println(myString);
		myString = myString + ". and more";
		System.out.println(myString);
		myString = myString + " \u00A9 and more";
		System.out.println(myString);
		
		String numberString = "250";
		numberString = numberString + "250";
		System.out.println(numberString);
		
		//since string was defined on the left. Java converted number into string too 
		//it also applies to other datatype
		String testString = "10";
		int testInt = 10;
		testString = testString + testInt;
		System.out.println(testString);
	}

}
