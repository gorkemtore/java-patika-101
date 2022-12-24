import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	static boolean isThere(int[] arr, int sayi) {
		for (int i : arr) {
			
			if(i == sayi) {
				return true;
			}
		
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] sayilar = {3,5,4,2,7,4,11,18,20,84,14,18,8,97,14,17,11,17,4};
		int [] birTaneOlanlar = new int[sayilar.length];
		int indis = 0;
		for (int i = 0; i < sayilar.length; i++) {
			for (int j = sayilar.length-1; j >0; j--) {
				if(sayilar[i] % 2 == 0) {
					if(sayilar[i] == sayilar[j] && i !=j) {
						
						if(!(isThere(birTaneOlanlar, sayilar[i]))) {
							birTaneOlanlar[indis++]=sayilar[i];
							
						}
						
					}
				}
				
			}
		}
		Arrays.sort(birTaneOlanlar);
		for (int i : birTaneOlanlar) {
			if(i!=0) {
				System.out.print(i+" ");
			}
			
		}
		
		

	}

}
