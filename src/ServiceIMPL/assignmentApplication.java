package ServiceIMPL;

import java.util.Scanner;

public class assignmentApplication {
   
	public static void main(String[] args) {
		
		CalculaterImpl cal= new CalculaterImpl();
		 Scanner scanner = new Scanner(System.in);
		 double a,b;
		 
		 System.out.print("Enter the value of a: ");
		 a = scanner.nextDouble();
		 
		 System.out.print("Enter the value of b: ");
		 b = scanner.nextDouble();
		 cal.add(a, b);
		 cal.sub(a, b);
		 cal.mult(a, b);
		 if(b==0) {
			System.out.println("cannot be divided by zero ");
		 }else{
			 cal.div(a, b);
		 }
		 cal.square(a);
		 cal.cube(a);
		 
	}
}
