import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username, password;
		Scanner input = new Scanner(System.in);
		int hak = 3 ;
		int para = 1500;
		
		while(hak!=0) {
			System.out.print("Kullanıcı adınızı giriniz : ");
			username = input.nextLine();
			System.out.print("Şifrenizi giriniz : ");
			password = input.nextLine();
			if(username.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhabalar Görkem bankasına hoş geldiniz !");
				int tercih ;
				System.out.print("1-Para yatırma\n"
						+ "2-Para çekme\n"
						+ "3-Bakiye sorgula\n"
						+ "4-Çıkış yap\n");
				
				tercih = input.nextInt();
				switch (tercih) {
				case 1: {
					System.out.print("Yatırmak istediğiniz tutar : ");
					int tutar = input.nextInt();
					para += tutar;
					break;
				}
				case 2:{
					System.out.print("Yatırmak istediğiniz tutar : ");
					int tutar = input.nextInt();
					if(tutar <= para) {
						para -= tutar;
					}else {
						System.out.println("Bakiye Yetersiz!");
					}
					break;
				}
				case 3:{
					System.out.print("Kalan bakiye : "+para);
					break;
				}
				case 4:{
					System.out.print("Tekrar görüşmek üzere. GörkemBank'ı tercih ettiğiniz için teşekkür ederiz :)");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + tercih);
				}
				
			}else {
				hak--;
				if(hak==0) {
					System.out.println("Yanlış giriş yaptınız. Kartınız bloke oldu.");
				}
				else {
					System.out.println("Yanlış giriş yaptınız. Kalan hakkınız : "+hak);
				}
				
			}
		}
		

	}

}
