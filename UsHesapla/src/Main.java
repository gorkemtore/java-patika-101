import java.util.Scanner;

public class Main {
	
	static void print(String metin) {
		System.out.print(metin);
	}
	
	
	static void usBul() {
		int taban, us, sonuc=1;
		Scanner s = new Scanner(System.in);
		print("Taban: ");
		taban = s.nextInt();
		print("Üs: ");
		us = s.nextInt();
		
		for(int i = 1; i<=us;i++) {
			sonuc*=taban;
		}
		print("Sonuç : "+sonuc+"\n");
	}
	
	
	public static void main(String[] args) {
		usBul();
		usBul();

	}

}
