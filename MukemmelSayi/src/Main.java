import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int sayi = s.nextInt();
		int toplam =0;
		for (int i = 1; i < sayi; i++) {
			if(sayi % i == 0) {
				toplam+=i;
			}
		}
		System.out.println(toplam==sayi ? "Mükemmel Sayıdır. ":"Değildir.");
	}

}
