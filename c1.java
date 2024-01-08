package calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
public class c1 {
     int num1 ;
	double num2 ;
	double data1;
	double data2;
	
	int d1;
	double d2;
	
	String s1;
	int s2;
	
	c1(int num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
		int ans = num1+(int)num2;
		System.out.println("sum is "+ ans);
	}
	c1(double num1,double num2){
		this.data1 = num1;
		this.data2 = num2;
		double ans = num1+num2;
		System.out.println("sum is "+ ans);
	}
	c1(String num1 , int num2){
		this.s1 = num1;
		this.s2 = num2;
		System.out.println(s1+s2);		
	}
		
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int val1;
	double val2;	
	
			try {
			System.out.println("Enter number1");
			 val1 = sc.nextInt();
			System.out.println("Enter number2");
			 val2 = sc.nextDouble(); 
			c1 obj = new c1(val1,val2);
		}
  catch(InputMismatchException e) {
//	  System.out.println(" enter number ");
		String d1 = sc.next();
		System.out.println("enter number ");
		int d2 = sc.nextInt();
		c1 obj2 = new c1(d1,d2);
  }
			catch( Exception e) {
				String s1 = sc.next();
				int s2 =  Integer.parseInt(sc.next());
				c1 obj3 = new c1(s1,s2);
			}
		catch (Throwable e){
//			System.out.println("Enter number1");
			double val3 = sc.nextDouble();
			System.out.println("Enter number2");
			double val4 = sc.nextDouble();
		    c1 obj1 = new c1(val3,val4);
		}
//		
	
			
	
	}
	
	
	
	
	
}

