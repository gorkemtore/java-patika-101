
public class Main {

	public static void main(String[] args) {
		
		System.out.print("2 ");
		for (int i = 3; i <= 100; i++) {
			boolean asal_mi = true;
			
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					asal_mi = false;
				}
			}
			if(asal_mi) {
				System.out.print(i+" ");
			}
			
		}

	}

}
