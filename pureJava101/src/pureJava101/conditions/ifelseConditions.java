package pureJava101.conditions;

import java.util.Scanner;

public class ifelseConditions {
	public static void main(String[] args) {
		//If else conditions
		Scanner scanner = new Scanner(System.in);
		enum notlar{
			A,B,C,D,F
		}
		System.out.print("Not giriniz : ");
		int score = scanner.nextInt();
		if(score >= 90 && score <= 100) {
			System.out.println(notlar.A);
		}
		else if(score >= 85 && score < 90) {
			System.out.println(notlar.B);
		}
		else if(score >= 70 && score < 85) {
			System.out.println(notlar.C);
		}
		else if(score >= 50 && score < 90) {
			System.out.println(notlar.D);
		}
		else if(score >= 0 && score < 50) {
			System.out.println(notlar.F);
		}
		else {
			System.out.println("Sonuç bulunamadı");
		}
		
	}
}
