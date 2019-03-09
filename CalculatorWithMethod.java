package com.danish.ideationzCalculator;

import java.util.Scanner;

public class CalculatorWithMethod {
	
	public static void main(String[] args) {
		double num = 0;
	
	 Scanner scanner = new Scanner(System.in);
	 double num1=scanner.nextDouble();
     while(scanner.hasNext()) { 
	   char c=scanner.next().charAt(0);
	   if(c=='=') {
		   System.out.println(num1);
	   }
	   double num2=scanner.nextDouble();
	   num1=CalculatorWithMethod.cal(num1, num2, c);
   }
}
	public static  double cal(double num1,double num2,char c) {
		double num = 0;
		if(c=='+') {
		num=	num1+num2;
		}
		else if(c=='-') {
			num=num1-num2;
			}
		else if(c=='*') {
			num=num1*num2;
			}
		else if(c=='/') {
			 num=num1/num2;
			}
		return num;
	}
}