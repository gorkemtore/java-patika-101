import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Faktöriyeli alınacak sayıyı girin: ");
		int sayi = input.nextInt();
		int faktoriyel = 1;
		if(sayi==0) {
			faktoriyel =1;
		}else {
			for (int i = sayi; i >1 ; i--) {
			faktoriyel *=i;
			}
		}	
		System.out.println("Faktoriyel : "+faktoriyel);
	}

}
