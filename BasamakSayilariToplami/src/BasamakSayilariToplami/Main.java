package BasamakSayilariToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int sayi = input.nextInt();
		int toplam=0;
			
		do {
			toplam+= sayi % 10;
			sayi = sayi/10;
		} while (sayi>0);
		System.out.println("Toplam basamak değeri :  "+toplam);
	}
}
