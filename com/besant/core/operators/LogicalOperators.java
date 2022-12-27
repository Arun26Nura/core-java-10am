package com.besant.core.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;		
		int c=12;
							// true  false true
		// AND  &&
		Boolean andOperatir= a>=10 && b>25  &&  c<100;
		System.out.println(andOperatir);
		
		// OR  ||
		
		Boolean orOperatir= a>=10 || b>25  ||  c<100;
		System.out.println(orOperatir);
		
		// OR  ||
		
		Boolean combinedOperatir= (a>=10 || b>25)  &&  c<100;
		System.out.println(combinedOperatir);
		
		

	}

}
