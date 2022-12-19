import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz :");
		int sayi = input.nextInt();
		for (int i = 0; i <= sayi; i+=2) {
			System.out.println(i);
		}

	}

}
