package com.testing;

import java.util.Iterator;

public class MyJavaBasicApplication {

	public static void main(String[] args) {
  		 
		System.out.println("******************");

//		METHODS

		MyJavaBasicApplication my = new MyJavaBasicApplication();

		my.myLogout(); 			// created obj(since its not static ) and called the method which belonged to
								// the class MyJavaApplication
		myLogin(); 				// directly calls out method without using obj

		my.addNumbers(5, 4); 	// add parameters to a method
		my.diffParamaters("string", 12, 23);
		System.out.println(my.addNumbers(5, 4));

		System.out.println("***********************");
		int j = 20; // instance variable

//		DATA TYPES
		/*
		 * primitive data types
		 * 
		 * byte 8-bit -128*127 short 16-bit -32767*32765 int 32-bit -2^31*2^31 long
		 * 64-bit -2^63*2^63 boolean true/false float 32-bit 5-6 digits long 64 bit
		 * 14-15 digits char letter/ascii
		 */
		/*
		 * byte re = -128; byte fu = 127; short sh = 16; int myInt; long joe = 43272l;
		 * boolean bo = true; double d = 0.58; float g = 2.588f; char c = 1;
		 */

		/*
		 * non-primitive data types
		 * 
		 * string arrays
		 * 
		 */
		
		/* String st = "sita"; */
		
		/*
		 * obj sita associated/defined to a variable st for datatype String
		 */

//		DataTypes dt=new DataTypes();

		/*
		 * new DataTypes obj is associated to dt of a non-primitive data type String
		 * called DataTypes
		 */

		/* System.out.println("this is my first program"); */

//		String literal versus object

		/*
		 * literal It alocates the same memory location in java heap memory
		 * 
		 * Object It allocates explicitly new location for object
		 */

		/*
		 * String str1 = "sita"; String str2 = new String(); String str3 = "sita";
		 * String str4 = "";
		 * 
		 * System.out.println(str2.length()); System.out.println(str4);
		 * System.out.println(str1 == str2); System.out.println(str1.equals(str2));
		 * System.out.println(str1 == str3);
		 */

//		Types of variables

		/*
		 * instance variable declared within the class can be accessed by all the
		 * methods within the class
		 * 
		 * local variable declared within the method(here the method is 'main') static
		 * variable
		 */

		// type variableName = value;
		
		/*
		 * int myNum = 10; int myNumber = 20; char ch = 'A'; String str5 = "RCV";
		 * 
		 * System.out.println(str5 + " " + ch); System.out.println(myNum + myNumber);
		 */

//		OPERATORS

		/*
		 * conditional operators && ||
		 * 
		 * ternary operator
		 */

		/*
		 * int myNumberIs = 10; int num1 = 40; int num2 = 20; int num3 = 30; String str
		 * = "ray"; boolean bool = true;
		 * 
		 * System.out.println(myNumberIs + 10); // adding numbers
		 * System.out.println(myNumberIs + str); // concatenation
		 * System.out.println(!bool);
		 */

		// if else condition

		/*
		 * if (num1 == 10) { System.out.println("right number"); } else {
		 * System.out.println("wrong number"); } if ((num1 == 10) && (num2 == 20)) //
		 * conditional operators { System.out.println("true value"); } else {
		 * System.out.println("false value"); }
		 */

		// if then else condition

		/*
		 * if (num1 > num2) { System.out.println("no. is greater than 2"); if (num2 <
		 * num3) { System.out.println("within nested if else"); } else {
		 * System.out.println("int he nested else block"); } } else if (num1 == num2) {
		 * System.out.println("no.1 equals to no.2"); } else if (num1 < num2) {
		 * System.out.println("no.1 less than no.2"); } else {
		 * System.out.println("final else block"); }
		 */

//		Ternary operators

		/*
		 * variable =(condition)? TrueExpression : FalseExpression
		 */

		/*
		 * String result = (num1 > num2) ? "true" : "false"; System.out.println(result);
		 * 
		 * boolean wire = (num1 < num2) ? true : false; System.out.println(wire);
		 * 
		 * int i = (num1 == num2) ? 1 : 2; System.out.println(i);
		 */

//		switch case 

		/*
		 * switch (expression) { case 1 : statements break case 2 : statements break
		 * default: none
		 * 
		 * }
		 * 
		 */

		/*
		 * int day = 6; switch (day) { case 1: System.out.println("sun"); break; case 2:
		 * System.out.println("m"); break; case 3: System.out.println("tu"); break; case
		 * 4: System.out.println("th"); break; case 5: System.out.println("f"); break;
		 * default: System.out.println("none"); }
		 */

//    LOOP CONDITIONS	

		/*
		 * while loop : we dont know the no. of iterations do while loop: we dont know
		 * the no. of iterations - we execute the code atleast once for loop: how many
		 * iterations we want to run
		 */

		/*
		 * while condition checks condition first if its true executes code inside loop
		 * goes on until its false
		 * 
		 * 
		 * while (condition) {
		 * 
		 * }
		 */

		/*
		 * int a = 2; while (a <= 10) { System.out.println(a); a++; }
		 * System.out.println("condition satisfied");
		 */

		/*
		 * do while loop executes the code first goes to the condition if its true loop
		 * goes on until its false the statements/the execution happens within in the
		 * loop atleast the stmnt is executed once without checking the condition
		 * 
		 */

		/*
		 * int e = 11; do { System.out.println(e); e++; } while (e>10);
		 */

		/*
		 * int w = 2; do { System.out.println(w); w++; } while (w > 10);
		 * System.out.println("outside dow while loop");
		 * 
		 * while (w > 10) { System.out.println(w); }
		 * System.out.println("outside while loop");
		 */

//		For loop
		/*
		 * for(initalisation ; condition ; increment/decrement/update ) {
		 * 
		 * }
		 */
		/*
		 * int t = 1; for (t = 1; t < 10; t++) { System.out.println(t); }
		 */

		/*
		 * int t=1; for (; t < 10;) // not a best practice { System.out.println(t); t++
		 * }
		 */

//		Break & Continue

		/*
		 * for (t = 0; t < 10; t++) { if (t==6) { break; // it breaks the loop and
		 * prints final statement } System.out.println(t); }
		 * System.out.println("final statement");
		 * 
		 * for (t = 1; t < 10; t++) { if (t == 6) { continue; // it continues the loop
		 * by skipping elements(6 skipped) } System.out.println(t); }
		 * System.out.println("final statement");
		 */

//		Nested loop  //15

		/*
		 * Initialize the nested loops correctly
		 */

		/*
		 * int count = 0; int x = 1; for (x = 1; x <= 4; x++) { int y = 1; while (y <=
		 * 5) { for (j = 1; j <= 2; j++) { System.out.println("value " + x + " value " +
		 * y + " value " + j + " "); count++; } y++; }
		 * 
		 * } System.out.println(count);
		 */

//		Arrays

		/*
		 * single dimensional array 10 - 0 to 10
		 * 
		 * multi-dimensional array
		 */

		/*
		 * int myArray = 4; int[] myIntArray= new int[10]; // single dimentional array
		 * myIntArray[0] = 6; myIntArray[1] = 3; myIntArray[2] = 5;
		 * System.out.println(myIntArray[2]);
		 * 
		 * int[] mArray = { 6, 5, 3, 7 }; System.out.println(mArray[3]);
		 * System.out.println(mArray.length);
		 * 
		 * int[] myArray1 = { 1, 2, 3, 4, 5 }; for (int o = 0; o < myArray1.length; o++)
		 * { System.out.println(myArray1[o]); }
		 */

//		Multi dimentional array
		
		/*
		 * int[][] myMultiDimArray = new int[2][3]; myMultiDimArray[0][0] = 2;
		 * myMultiDimArray[0][1] = 3; myMultiDimArray[0][2] = 1; myMultiDimArray[1][0] =
		 * 4; myMultiDimArray[1][1] = 5; myMultiDimArray[1][2] = 6;
		 * System.out.println(myMultiDimArray[1][2]);
		 */

		/* System.out.println("**************************************"); */

		/*
		 * int[][] myMultiDimArray1 = { { 2, 3, 5 }, { 6, 8, 9 } };
		 * System.out.println(myMultiDimArray1[1][2]);
		 * System.out.println("**************************************");
		 * System.out.println(myMultiDimArray1.length);
		 * 
		 * for (int g1 = 0; g1 < myMultiDimArray1.length; g1++) {
		 * System.out.println(g1); System.out.println(myMultiDimArray1[g1].length); for
		 * (int d1 = 0; d1 < myMultiDimArray1[g1].length; d1++) {
		 * System.out.println(myMultiDimArray1[g1][d1]); } }
		 */

	}

	/*
	 * Methods
	 * 
	 * 
	 */

	/*
	 * PACKAGES
	 * 
	 * If you want to callout an method of demo.java in another demo2.java same
	 * package, create obj in demo2.java and callout. If you want to callout an
	 * method of demo.java(soumya package) to demo2.java(soujanya package), add the
	 * particular package(soumya package) to demo2.java
	 * 
	 * 
	 */
	
	public static void myLogin() {
		System.out.println("login succesfull");
	}

	public void myLogout() {
		System.out.println("logout succesfull");
	}

	public int addNumbers(int x, int y) {
		int z = x + y;
		return z;

	}

	public void diffParamaters(String s, int i, float f) {
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);

	}
	
	
}
