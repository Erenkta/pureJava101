package pureJava101.conditions;

import java.util.Scanner;

public class switchConditions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi1 = ");
		float sayi1 = Float.parseFloat(scanner.nextLine());
		System.out.print("Sayi2 = ");
		float sayi2 = Float.parseFloat(scanner.nextLine());
		System.out.print("Islem = ");
		char islem = scanner.nextLine().charAt(0);
		
		switch(islem) {
		case '+':
			System.out.println(sayi1 + sayi2);
			break;
		case '-':
			System.out.println(Math.abs(sayi1-sayi2));
			break;
		case '*':
			System.out.println(sayi1*sayi2);
			break;
		case '/':
			System.out.println(sayi1/sayi2);
			break;
		default:
			System.out.println("Lütfen geçerli bir işlem giriniz");
			break;
		}

	}

}
