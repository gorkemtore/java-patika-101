import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		
		if(sayi % 2 == 1) {
			System.out.print("Weird");
		}else {
			if(sayi >=2 && sayi <=5) {
				System.out.print("Not Weird");
			}else if(sayi>=6 && sayi<=20) {
				System.out.print("Weird");
			}else if(sayi>20) {
				System.out.print("Not Weird");
			}
		}
	}

}
