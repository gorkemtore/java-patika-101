import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz :" );
		int adet = s.nextInt();
		int enBuyuk=0;
		int enKucuk = (int) (Math.pow(2, 31)-1);
		for (int i = 0; i < adet; i++) {
			System.out.print("Sayı giriniz : ");
			int sayi = s.nextInt();
			if(sayi > enBuyuk) {
				enBuyuk = sayi;
			}
			if(sayi<enKucuk) {
				enKucuk = sayi;
			}	
		}
		System.out.println("En büyük sayı : "+enBuyuk);
		System.out.print("En küçük sayı : "+enKucuk);

	}

}
