import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl giriniz : ");
		int yil = input.nextInt();
		
		String artikYil = yil % 4 == 0 ? "Evet, " +yil + " artık yıldır." :
			"Hayır, "+yil +" artık yıl degildir.";
		System.out.println(artikYil);

	}

}
