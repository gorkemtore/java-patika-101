import java.util.Scanner;

public class Main {
	
	static void asalMi() {
		Scanner s = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int sayi = s.nextInt();
		boolean kontrol = true;
		for (int i = 2; i < sayi; i++) {
			if(sayi %i ==0) {
				kontrol = false;
				break;
			}
		}
		System.out.print(kontrol == true ? sayi+ " asaldır.\n\n" : sayi+ " asal değildir.\n\n");
		asalMi();
		
	}

	public static void main(String[] args) {
		
		asalMi();
	}

}
