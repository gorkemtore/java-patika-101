import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] burclar = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz",
				"Kaplan","Tavşan","Enderha","Yılan","At","Koyun"};
		
		System.out.println("Doğum yılınızı giriniz : ");
		short dogumYili = input.nextShort();
		
		int kalan = dogumYili % 12;
		
		for (int i=0 ; i<12 ; i++) {
			if (kalan==i) {
				System.out.print("Burcunuz : "+burclar[i]);
			}
		}
		

	}

}
