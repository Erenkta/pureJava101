import java.time.DayOfWeek;
import java.util.Arrays;

public class Statics {
	//int i = 10
	static int i;
	//Static Initializers
	static { //static bir bloktur nesne oluşturulmadan otomatik çağrılır
		System.out.println("Static Blok Calisti"); //hiçbir şey yapmasak da runtime'da derlendi çalıştı
		i = 10; //bunun gibi staticlere değer de atayabiliriz
	}
	public static void main(String[] args) {
		//i'ye burdan erişemeyiz çünkü static methodlar sadece static değişkenlere erişebilir
		System.out.println(i);
		//Eğer static olmasaydı erişmek için class'tan bir nesne oluşturmalıydık
		
		System.out.println(Math.PI); //static bir importtur direkt kullandık
		
		//Static Methods
		System.out.println(Math.pow(2,3)); //Math kütüphanesi statictir bundan dolayı instance oluşturmadan erişebiliriz
		
		
		//enum sabitler listesi olarak da bilinir
		enum mevsimler{
			Ilkbahar,Yaz,Sonbahar,Kis
		}
		mevsimler mevsim = mevsimler.Sonbahar;
		System.out.println(mevsim);
		//methods
		mevsimler[] m = mevsimler.values();
		System.out.println(Arrays.toString(m));
		
		//Hazır enumlar
		DayOfWeek sunday = DayOfWeek.SUNDAY;
		DayOfWeek of = DayOfWeek.of(3);
		System.out.println(sunday);
		System.out.println(of);
		//Month da bir enumdur
				
	}
}
