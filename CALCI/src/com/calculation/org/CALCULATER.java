package com.calculation.org;

import java.util.Scanner;

public class CALCULATER {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num1;
		int num2,add,sub,mul,div;
		String operation;
		System.out.println("enter number1");
		num1 = scanner.nextInt();
		System.out.println("enter number2");
		num2=scanner.nextInt();
		System.out.println("enter the operations:+,-,*,/");
		operation = scanner.next();
	switch(operation) {

	case("+"):
		add=num1+num2;
	System.out.println("add:"+add);
	break;
	
	case("-"):
		sub=num1-num2;
	System.out.println("sub:"+sub);
	break;
	
	case("*"):
	mul=num1*num2;
	System.out.println("mul:"+mul);
	break;
	
	case("/"):
	div=num1/num2;
	System.out.println("div:"+div);
	break;
	default:
		System.out.println("the operation has failed");
	break;
	}
	
	}
}
	
