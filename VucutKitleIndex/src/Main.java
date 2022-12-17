import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kilonuzu giriniz : ");
		double kilo = input.nextDouble();
		
		System.out.print("Boyunuzu giriniz : ");
		double boy = input.nextDouble();
		
		double vki = kilo / (boy*boy);
		
		System.out.println("Vücut kitle indeksiniz : "+vki);
		

	}

}
