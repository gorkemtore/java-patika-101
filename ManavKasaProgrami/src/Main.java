import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double armut_kg,elma_kg,muz_kg,domates_kg, patlican_kg;
		double armut_fiyat = 2.14, elma_fiyat = 3.67, muz_fiyat = 0.95, domates_fiyat=1.11, patlican_fiyat=5.00;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Armut kilogram: ");
			armut_kg = input.nextDouble();
			
			System.out.print("Elma kilogram: ");
			elma_kg = input.nextDouble();
			
			System.out.print("Muz kilogram: ");
			muz_kg = input.nextDouble();
			
			System.out.print("Domates kilogram: ");
			domates_kg = input.nextDouble();
			
			System.out.print("Patlıcan kilogram: ");
			patlican_kg = input.nextDouble();
		}
		
		double hesap = (armut_kg*armut_fiyat)+(elma_kg*elma_fiyat) + 
						(muz_kg*muz_fiyat) +(domates_kg*domates_fiyat)+
						(patlican_kg*patlican_fiyat) ;
		
		System.out.println("Ödemeniz gereken tutar : "+ hesap);
		
		

	}

}
