package ServiceIMPL;

import java.text.DecimalFormat;

public class CalculaterImpl {

	DecimalFormat df = new DecimalFormat("#.00");
	double result,a,b;

	public void add(double a,double b) {
		result = a+b;
		System.out.println("addition of two numbers is :"+  df.format(result));
	}

	public void sub(double a,double b) {
		result = a - b;
		System.out.println("Subtraction  of two numbers is :" +  df.format(result));
	}

	public void mult(double a,double b) {
		result = a * b;
		System.out.println("multiplication of two numbers is :" +  df.format(result));
	}

	public void div(double a,double b) {
		
		result = a / b;
		System.out.println("division  of two numbers is :" + df.format(result));
		
	}

	public void square(double a) {
		result = a * a;
		System.out.println(" square of two numbers is :" +  df.format(result));
	}

	public void cube(double a) {
		result = a * a * a;
		System.out.println("cube of two numbers is :" +  df.format(result));
	}

}
