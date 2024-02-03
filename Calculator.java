package conditionalstatements;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	private static int n1;
	private static int n2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("Enter first number");
			try {
				int num1 = sc.nextInt();
				Calculator.n1 = num1;
			} catch (InputMismatchException e) {
				System.out.println("Enter integer only");
				Calculator.main(args);
			}

			System.out.println(
					"Enter the symbol for operation,\nfor addition->'+',\nfor substraction->'-',\nfor multiplication->'*',\nfor division->'/',\nfor modulus-'%'");
			char ch = sc.next().charAt(0);
			if ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/') || (ch == '%')) {

			} else {
				System.out.println("Enter correct symbol");
				Calculator.main(args);
			}

			System.out.println("Enter second number");
			try {
				int num2 = sc.nextInt();
				Calculator.n2 = num2;
			} catch (InputMismatchException e) {
				System.out.println("Enter integer only");
				Calculator.main(args);
			}

			switch (ch) {

			case '+': {
				System.out.println(n1 + n2);
				break;
			}
			case '-': {
				System.out.println(n1 - n2);
				break;
			}
			case '*': {
				System.out.println(n1 * n2);
				break;
			}
			case '/': {
				System.out.println(n1 / n2);
				break;
			}
			case '%': {
				System.out.println(n1 % n2);
				break;
			}
			default: {
				System.out.println("Enter correct symbol");
			}
			}
			System.out.println("if want to continue press y,if not press any key");
			char ch1 = sc.next().charAt(0);
			if (ch1 == 'y') {
				continue;
			} else {
				System.exit(0);
			}
		}
	}
}
