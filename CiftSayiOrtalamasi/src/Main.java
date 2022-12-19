import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int toplam = 0, adet=0;
		while(true) {
			System.out.print("Sayı giriniz : ");
			int sayi = input.nextInt();
			if (sayi % 2 == 0) {
				if(sayi % 4 == 0) {
					toplam+=sayi;
					adet++;
				}
			}else {
				break;
			}
		}
		System.out.println("Ortalama : "+toplam/adet);

	}

}
