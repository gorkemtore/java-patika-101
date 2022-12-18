import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı 1 giriniz: ");
		double sayi1 = input.nextDouble();
		
		System.out.print("İslem: ");
		char islem = input.next().charAt(0);
		
		System.out.print("Sayı 2 giriniz: ");
		double sayi2 = input.nextDouble();
		
		switch (islem) {
		case '+': {
			
			System.out.println("Toplam = "+ (sayi1+sayi2));
			break;
		}
		case '-': {
					
					System.out.println("Toplam = "+ (sayi1-sayi2));
					break;
				}
		case '/': {
					
					System.out.println("Toplam = "+ (sayi1/sayi2));
					break;
				}
		case '*': {
					
					System.out.println("Toplam = "+ (sayi1*sayi2));
					break;
				}
		default:
			throw new IllegalArgumentException("Unexpected value: " + islem);
		}

	}

}
