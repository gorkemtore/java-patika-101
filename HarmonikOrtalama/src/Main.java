public class Main {
	public static void main(String[] args) {
		
		int[] sayilar = {1,2,3,4,5};
		double toplam=0.0;
		
		for (int i = 0; i < sayilar.length; i++) {
			toplam += 1.0 / sayilar[i];
		}
		System.out.println(toplam/sayilar.length);
		
	}
}
