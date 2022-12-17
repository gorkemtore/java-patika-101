import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int acilisUcreti = 10;
		double odenecekTutar;
		System.out.print("Gidilen kilometreyi giriniz: ");
		int km = input.nextInt();
		
		odenecekTutar = acilisUcreti + km*2.20 > 20 ? acilisUcreti + km*2.20 : 20;
		System.out.println(odenecekTutar);
		

	}

}
