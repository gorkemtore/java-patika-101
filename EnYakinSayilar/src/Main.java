import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] sayilar = new int[10];
		for (int i = 0; i < 10; i++) {
			sayilar[i] =(int)(Math.random()*100);
			
		}
		System.out.println(Arrays.toString(sayilar));
		
		Scanner s = new Scanner(System.in);
		System.out.print("Girilen sayı : ");
		int girilen = s.nextInt();
		s.close();
		
		Arrays.sort(sayilar);
		int indis = Arrays.binarySearch(sayilar, girilen);
		
		if(indis == 0) {
			System.out.println("Daha küçük bir sayı yoktur.");
		}else {
			System.out.println("Girilen sayıdan küçük en yakın sayı : "+sayilar[indis-1]);
		}
		if(indis == sayilar.length-1) {
			System.out.println("Daha büyük bir sayı yoktur.");
		}else {
			System.out.println("Girilen sayıdan büyük en yakın sayı : "+sayilar[indis+1]);
		}
 	}
	
	
}
