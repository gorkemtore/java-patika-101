import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean isThere(int[] arr, int value) {
		for (int i : arr) {
			if(i == value)
				return true;
			
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Dizi boyutu : ");
		int boyut = s.nextInt();
		int[] sayilar = new int[boyut];
		int indis =0;
		
		int[] siraliSayilar = new int[boyut];
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.print((i+1)+". Elaman : ");
			sayilar[i] = s.nextInt();
		}
		s.close();
		int enKucuk=2147483647;
		
		for (int j = 0; j < sayilar.length; j++) {
			
			for (int i = 0; i < sayilar.length; i++) {
				
				if(!(isThere(siraliSayilar, sayilar[i])))
				{
					if(sayilar[i]<enKucuk) {
						
						enKucuk = sayilar[i];
					}
				}
				
				
			}
			
			siraliSayilar[indis++]=enKucuk;
			enKucuk = 2147483647;
				
		}
		System.out.println(Arrays.toString(siraliSayilar));
		
		

	}

}
