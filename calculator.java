package calculator;

import java.util.Scanner;

public class calculator {

	public <T extends Number>double add(T augend, T addend) {
		double a =(double)augend;
		double b =(double)addend;
		return a + b;
	}

	public <T extends Number>double sub(T augend, T addend) {
		double a =(double)augend;
		double b =(double)addend;
		return a - b;
	}

	public <T extends Number>double mul(T augend, T addend) {
		double a =(double)augend;
		double b =(double)addend;
		return a * b;
	}

	public <T extends Number>double div(T augend, T addend) {
		double a =(double)augend;
		double b =(double)addend;
		return a / b; 
	}
	public static void displayAdd() {
		Scanner sc = new Scanner(System.in);
		int x =  1;
		do {
			try {
				System.out.println("enter number1 ");
				double val1 = Double.parseDouble(sc.next());
				System.out.println("enter number2 ");
				double val2 = Double.parseDouble(sc.next());
				calculator obj = new calculator();
				System.out.println("sum is  "+obj.add(val1,val2)); 
				x++;

			}
			catch(NumberFormatException e) {
				System.out.println("please enter proper input!");

			}
		}while(x==1);
	}

	public static void displaySub() {
		int x =1;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("enter number1 ");
				double val1 = Double.parseDouble(sc.next());
				System.out.println("enter number2 ");
				double val2 = Double.parseDouble(sc.next());
				calculator obj = new calculator();
				System.out.println("sub is "+obj.sub(val1,val2)); 
				++x;

			}
			catch(NumberFormatException e) {
				System.out.println("please enter proper input!");

			}
		}while(x==1);

	}
	public static void displayMul()
	{int x = 1;
	Scanner sc = new Scanner(System.in);
	do {

		try {
			System.out.println("enter number1 ");
			double val1 = Double.parseDouble(sc.next());
			System.out.println("enter number2 ");
			double val2 = Double.parseDouble(sc.next());
			calculator obj = new calculator();
			System.out.println("mul is "+obj.mul(val1,val2)); 
			++x;

		}
		catch(NumberFormatException e) {
			System.out.println("please enter proper input!");

		}
	}while(x==1);
	}
	public static void displayDiv() {
		Scanner sc = new Scanner(System.in);
		int x =1;
		do {

			try {
				System.out.println("enter number1 ");
				double val1 = Double.parseDouble(sc.next());
				System.out.println("enter number2 ");
				double val2 = Double.parseDouble(sc.next());
				calculator obj = new calculator();
				System.out.println("div is "+obj.div(val1,val2)); 
				++x;

			}
			catch(NumberFormatException e) {
				System.out.println("please enter proper input!");

			}
		}while(x==1);

	}
	public static void userinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which operation do you want to perform ?");	
		String  sign = sc.next();
		switch(sign) {
		case "+":displayAdd();
		userinput();
		break;
		case "-":displaySub();
		userinput();
		break;
		case "*":displayMul();
		userinput();
		break;
		case "/":displayDiv();
		userinput();
		break;
		default:System.out.println("Invalid input!");
		userinput();
		break;
		}
	}
	public static void main(String[] args) {
		System.out.println("Calculator");	
		Scanner sc = new Scanner(System.in);
		//		System.out.println("Which operation do you want to perform ?");	
		//		String sign = sc.next();
		int y=0;
		do {
			System.out.println("Which operation do you want to perform ?");	
			String sign = sc.next();
			switch(sign) {
			case "+":
			{   y=1;

			do {
				displayAdd();
				userinput();
			}while(true);

			}
			case "-":{
				y=1;
				do {
					displaySub();
					userinput();
				}while(true);

			}
			case "*":{
				y=1;
				do{
					displayMul();
					userinput();
				}while(true);
			}
			case "/":{
				y=1;
				do {
					displayDiv();
					userinput(); 
				}while(true);

			}
			default:{
				System.out.println("invalid input!");	
				break;
			}

			}
		}while(y==0);


	}
}
