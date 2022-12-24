import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	
	
	public static void main(String[] args) {
		int[] sayilar = {3,5,4,2,7,4,11,18,20,84,14,18,8,97,14,17,11,17};
		int [] birTaneOlanlar = new int[sayilar.length];
		int indis = 0;
		for (int i = 0; i < sayilar.length; i++) {
			for (int j = sayilar.length-1; j >0; j--) {
				if(sayilar[i] % 2 == 0) {
					if(sayilar[i] == sayilar[j] && i !=j) {
						
						birTaneOlanlar[indis++]=sayilar[j];
						
					}
				}
				
			}
		}
		Arrays.sort(birTaneOlanlar);
		
		
		for (int i = 0; i < birTaneOlanlar.length; i+=2) {
			if(birTaneOlanlar[i]!=0) {
				
				System.out.print(birTaneOlanlar[i]+" ");
				
			}
		}
		
		

	}

}
