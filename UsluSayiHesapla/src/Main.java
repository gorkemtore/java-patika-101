import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Taban : ");
		int taban = input.nextInt();
		System.out.print("Üs : ");
		int us = input.nextInt();
		int sonuc=taban;
		for (int i = 1; i<us ; i++) {
			sonuc = sonuc*taban;
		}
		System.out.println(sonuc);
		
	}

}
