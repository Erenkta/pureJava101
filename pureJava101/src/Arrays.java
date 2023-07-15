import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		//Üç farklı şekilde dizi tanımlaması
		int[] numbers;
		numbers = new int[12];
		//int[] numbers = new int[12];
		//int numbers = {1,2,3,4,5,6,7,8,9,10,11}
		numbers[5] = 5; //Dizinin 6.elemanı 5 
		
		//Çok boyutlu diziler
		int[][] sayilar = new int [2][3]; //2 satır 3 sütunlu bir tablo
		sayilar[0][0] = 1;
		sayilar[1][0] = 2; //Bunun gibi atamalar yapıyoruz
		
		for(int i = 0;i<sayilar.length;i++) {
			for(int j = 0; j< sayilar[i].length;j++) {
				System.out.println(sayilar[i][j]);
			}
		}
		
		String[][] ogrenciler = new String[3][2];
		ogrenciler[0][1] = "a";
		ogrenciler[1][1] = "al";
		ogrenciler[2][1] = "ali";
		
		for(int i = 0;i<ogrenciler.length;i++) {
			for(int j = 0; j< ogrenciler[i].length;j++) {
				System.out.print(i +" " +j +" ");
				System.out.println(ogrenciler[i][j]);
			}
		}
		
		//Kullanıcıya bağlı bir dizi oluşturmak
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizi uzunluğu giriniz : ");
		int length = scanner.nextInt();
		int[] myNumbers = new int[length];
		for(int i = 0;i<length;i++) {
			myNumbers[i] = scanner.nextInt();
		}
		scanner.close();
		//References Type
		int[] numbers2 = {1,2,3};
		int[] numbers3 = numbers2;
		//Bu iki dizi aynı oldu
		
		numbers2[0] = 5; // dersek numbers3'ün ilk elemanı da 5 olur References type sayesinde
		
		
		//Array Sınıfı methodları
		int[] arr = {12,-5,25,156};
		//Arrays.binarySearch(arr,12) //12 kaçıncı indexte
		//int[] copyOfarr = Arrays.copyOf(numbers,3); Eğer 10 yazsaydık geri kalan elemanlar 0 olacaktı
		//int[] copyOfRange = Arrays.copyOfRange(arr,2,4) 3.Indexten 5.index'e kadar kopyalar (3 ve 4) 5 dahil değil
		//Javada ilk gönderilen her zaman dahil sonuncu her zaman dışarıdadır
		//Arrays.fill(arr,44) tüm elemanları 44 yapacaktır
		//Arrays.sort(arr) // küçükten büyüğe doğru sıralar
	


	}

}
