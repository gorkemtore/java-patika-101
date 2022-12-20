import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Basamak sayısı giriniz: ");
		int basamak = input.nextInt();
		//1,3,5,7,9,11,13,15,17,19
		
		for (int i = basamak; i > 0; i--) {
			
			for (int j = 0; j < basamak-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i*2-1; j++) {//kalan basamak sayisi*2 - 1 = cizilecek yildiz sayisi
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	
	}
}
