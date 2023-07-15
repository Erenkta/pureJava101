import java.util.Scanner;

public class Operators {
	public static boolean test() {
		System.out.println("Method çalıştı");
		return true;
	}

	public static void main(String[] args) {
		// int i; //Expression
		// int x = 10; //Decleration
		
		//Aritmetik Operatörler
		int x = 10; int y = 15;
		System.out.println(x+y);
		//x*y , x/y , x-y
		float yf = 15f;
		System.out.println(yf + x); //aynı şekilde diğerleri de .0 lı yazılacaktır
		
		// % operatörü kalanı geri döndürür
		
		int a = 5;
		a += 2;
		//A'nın yeni değeri 7
		System.out.println(a++); //bu yazdırdı sonra arttırdı elde var +1
		System.out.println(++a); //buraya +1 geldi 7+1 = 8 ++ önde olduğu için 8+1 = 9 oldu
	
		int i = 10; //32 bit = 4 byte = 00000000 00000000 00000000 00001010
		int z = 4; // 32 bit = 4 byte = 00000000 00000000 00000000 00000100
		System.out.println(~i); // tersini aldığı bir olarak -11 oldu o da 
		System.out.println(i & z); // 0 ve 0 = 0 , 0 ve 1 = 0 1 ve 1 = 1 
		System.out.println(i | z); // 0 veya 0 = 0 , 0 veya 1 = 1 1 veya 1 = 1
		System.out.println(z >> 1); // 1 defa sağa kaydırma Right shift //sayıyı 2 ye böldük
		System.out.println(z << 1); // 1 defa sola kaydırma Left shift //sayıyı 2 ile çarptık
		
		
		//İlişkisel Opeatörler
		//< , > , == , != 
		
		int sayi1 = 10;
		int sayi2 = 15;
		System.out.println(10 < 15);
		System.out.println(10 == 15);
		
		boolean b = sayi1 != sayi2;
		System.out.println(b);
		
		//Mantıksal Operatörler
		boolean bool = false;
		System.out.println(!bool); // bool & false = false , bool & true = false
		
		// && = ve ,, || = veya
		System.out.println(bool || test()); //false || true = true
		
		
		//Koşul Operatörleri
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yaş giriniz : ");
		int age = scanner.nextInt();
		System.out.println(age >= 18 ? "Ehliyet Alabilirsin" : "Ehliyet Alamazsın");
		
		
		
	}

}
