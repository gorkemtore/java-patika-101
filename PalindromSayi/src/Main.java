import java.util.Scanner;

public class Main {
	
	static void hesapla(int s) {
		boolean kontrol = true;
		
		String sayi = String.valueOf(s);
		int ilkRakam = 0;
		int sonRakam = sayi.length()-1;
		for (int i = 0; i < sonRakam; i++) {
			if(sayi.charAt(ilkRakam++) !=sayi.charAt(sonRakam--)) {
				kontrol = false;
				break;
			}
		}
		System.out.println(kontrol ? s+" Palindromdur. ": s+" Palindrom değildir.");
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı: ");
		int s= input.nextInt();
		hesapla(s);
		
		

	}

}
