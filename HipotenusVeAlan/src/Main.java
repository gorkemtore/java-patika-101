import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("1. Dik kenarı giriniz : ");
			int k1 = input.nextInt();
			
			System.out.print("2. Dik kenarı giriniz : ");
			int k2 = input.nextInt();
			
			//a^2 + b^2 = c^2
			int calcHypotenuse = (int) Math.sqrt(k1*k1 + k2*k2);
			
			System.out.println("Hipotenüs : "+calcHypotenuse);
			
			
			int calcAreaOfTriangle = k1*k2/2;
			System.out.println("Alan : "+calcAreaOfTriangle);
		}

	}

}