package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double resultado;
		double y;
		double x;
		char cont = 'y';
		
		System.out.println();
		System.out.println("Which mathematical operation would you like to perform?");
		System.out.println("1. Addition;");
		System.out.println("2. Subtraction;");
		System.out.println("3. Division;");
		System.out.println("4. Multiplication;");
		System.out.println("5. Percentage;");
		System.out.println("6. Square Root;");
		System.out.println();
		
		while (cont == 'y' || cont == 'Y')
		{
			System.out.print("Enter the operation number here: ");
			int op = sc.nextInt();
			System.out.println();
			
			switch(op) {
			
			case 1:
				System.out.println("Ok, you choose addition.");
				System.out.println("Now let's decide the values for the operation!");
				System.out.print("Enter the value of X: ");
				x = sc.nextDouble();
				System.out.print("Enter the value of Y: ");
				y = sc.nextDouble();
				resultado = x + y;
				System.out.printf("The value of the operation is: %.2f%n", resultado);
				System.out.println();
				break;
				
			case 2:
				System.out.println("Ok, you choose subtraction.");
				System.out.println("Now let's decide the values for the operation!");
				System.out.print("Enter the value of X: ");
				x = sc.nextDouble();
				System.out.print("Enter the value of Y: ");
				y = sc.nextDouble();
				resultado = x - y;
				System.out.printf("The value of the operation is: %.2f%n", resultado);
				System.out.println();
				break;
				
			case 3:
				System.out.println("Ok, you choose division.");
				System.out.println("Now let's decide the values for the operation!");
				System.out.print("Enter the value of X: ");
				x = sc.nextDouble();
				System.out.print("Enter the value of Y: ");
				y = sc.nextDouble();
				resultado = x / y;
				System.out.printf("The value of the operation is: %.2f%n", resultado);
				System.out.println();
				break;
				
			case 4:
				System.out.println("Ok, you choose multiplication.");
				System.out.println("Now let's decide the values for the operation!");
				System.out.print("Enter the value of X: ");
				x = sc.nextDouble();
				System.out.print("Enter the value of Y: ");
				y = sc.nextDouble();
				resultado = x * y;
				System.out.printf("The value of the operation is: %.2f%n", resultado);
				System.out.println();
				break;
			
			case 5:
				System.out.println("Ok, you choose percentage.");
				System.out.println("Now let's decide the values for the operation!");
				System.out.print("How many percent do you want to calculate?: ");
				x = sc.nextDouble();
				System.out.print("Ok, how much value? ");
				y = sc.nextDouble();
				resultado = (x * y) / 100;
				System.out.printf("The value of the operation is: %.2f%n", resultado);
				System.out.println();
				break;
				
			case 6:
				System.out.println("Ok, you choose square root.");
				System.out.println("Now let's decide the values for the operation!");
				System.out.print("Enter the value of the square root you want to calculate: ");
				x = sc.nextDouble();
				resultado = Math.sqrt(x);
				System.out.printf("The square root of %.2f is %.2f%n", x, resultado);
				System.out.println();
				break;
			}
			
			System.out.println("Would you like to continue performing mathematical operations? Y/N");
			cont = sc.next().charAt(0);
		}
		
		sc.close();
	}

}
