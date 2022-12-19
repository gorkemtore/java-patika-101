import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz : ");
		int sayi = input.nextInt();
		System.out.println("4'ün kuvvetleri\n-----------------------");
		for (int i = 1; i < sayi; i*=4) {
			System.out.print(i+",");
		}
		System.out.println("\n5'in kuvvetleri\n-----------------------");
		
		for (int i = 1; i < sayi; i*=5) {
			System.out.print(i+",");
		}
	}
}
