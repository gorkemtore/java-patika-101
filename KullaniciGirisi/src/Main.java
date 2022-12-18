import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String sifre = "java@ogreniyoruz123";
		String kullaniciAdi = "patikadev";
		boolean sifirla =false;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kullanıcı adı: ");
		String _kullaniciAdi = input.next().intern();
		
		System.out.print("Şifre : ");
		String _sifre = input.next().intern();
		
		if(sifre.equals(_sifre)&& kullaniciAdi.equals(_kullaniciAdi) ) {
			System.out.println("Giriş Başarılı...");
		}
		else if(kullaniciAdi.equals(_kullaniciAdi)==false) {
			System.out.println("Böyle bir kullanıcı bulunamadı...");
		}
		else if(sifre.equals(_sifre)== false) {
			System.out.print("Şifreniz yanlış, sıfırlamak ister misiniz? (E/H):  ");
			
			switch (input.next().intern()){
			case "E":
			case "e":
			case "Evet": {
				
				sifirla = true;
				break;
			}
			case "H":
			case "h":
			case "Hayır":{
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + input.tokens());
			}
			
		}
		
		if(sifirla) {
			System.out.print("Yeni şifre giriniz: ");
			_sifre = input.next().intern();
			
			System.out.println("Yeni şifreniz = "+_sifre);
			sifre = _sifre;

		}
	
		

	}

}
