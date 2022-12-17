import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			
			//kdvsiz fiyat
			System.out.print("Tax free price: ");
			double taxFreePrice = input.nextDouble();
			
			
			double kdvAmount = taxFreePrice >= 1000 ? 1.08 : 1.18;
			
			//kdv dahil fiyat
			double taxPrice = taxFreePrice*kdvAmount;
			
			//kdv tutarı 
			double calculateKdv = taxPrice - taxFreePrice;
			
			System.out.println("Kdv'siz fiyat : "+taxFreePrice);
			System.out.println("Kdv tutarı : "+calculateKdv);
			System.out.println("Kdv dahile fiyat : "+taxPrice);
			
			
		}
		

	}

}