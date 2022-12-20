import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı 1: ");
		int sayi1 = input.nextInt();
		System.out.print("Sayı 2: ");
		int sayi2 = input.nextInt();
		int kucukSayi = sayi1 < sayi2 ? sayi1 : sayi2 ;
		int ekok=0;
		for (int i = kucukSayi; i >= 1; i--) {
			if(sayi1 % i == 0 && sayi2 % i == 0) {
				ekok = (sayi1*sayi2)/i;
				System.out.println("En büyük ortak bölen: "+i);
				break;
			}
		}
		System.out.println("En küçük ortak kat: "+ekok);
	}

}
