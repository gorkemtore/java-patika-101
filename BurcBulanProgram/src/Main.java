import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (
				Scanner input = new Scanner(System.in)) {
				System.out.print("Ay giriniz :");
				int ay = input.nextInt();
				System.out.print("Gün giriniz : ");
				int gun = input.nextInt();
			
				
				if (ay==1) {
					if(gun>=22) {
						System.out.println("Kovasınız");
					}
					else {
						System.out.println("Oğlaksınız");
					}
				}else if(ay==2) {
					
					if(gun>=20) {
						System.out.println("Balıksınız");
					}
					else {
						System.out.println("Kovasınız");
					}
				}else if(ay==3) {
					
					if(gun>=21) {
						System.out.println("Koçsunuz");
					}
					else {
						System.out.println("Balıksınız");
					}
				}else if(ay==4) {
					
					if(gun>=21) {
						System.out.println("Boğasınız");
					}
					else {
						System.out.println("Koçsunuz");
					}
				}else if(ay==5) {
					
					if(gun>=22) {
						System.out.println("İkizlersiniz");
					}
					else {
						System.out.println("Boğasınız");
					}
				}else if(ay==6) {
					
					if(gun>=23) {
						System.out.println("Yengeçsiniz");
					}
					else {
						System.out.println("İkizlersiniz");
					}
				}else if(ay==7) {
					
					if(gun>=23) {
						System.out.println("Aslansınız");
					}
					else {
						System.out.println("Yengeçsiniz");
					}
				}else if(ay==8) {
					
					if(gun>=20) {
						System.out.println("Başaksnız");
					}
					else {
						System.out.println("Aslansınız");
					}
				}else if(ay==9) {
					
					if(gun>=23) {
						System.out.println("Terazisiniz");
					}
					else {
						System.out.println("Başaksınız");
					}
				}else if(ay==10) {
					
					if(gun>=23) {
						System.out.println("Akrepsniz");
					}
					else {
						System.out.println("Terazisiniz");
					}
				}else if(ay==11) {
					
					if(gun>=22) {
						System.out.println("Yaysınız");
					}
					else {
						System.out.println("Akrepsiniz");
					}
				}else if(ay==12) {
					
					if(gun>=22) {
						System.out.println("Oğlaksınız");
					}
					else {
						System.out.println("Yaysınız");
					}
				}
		}
	
	}

}
