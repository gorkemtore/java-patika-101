import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fiyat = 0;
		double indirim = 0;
		try {
			System.out.print("Mesafeyi km türündengiriniz :");
			int mesafe = input.nextInt();
			if(mesafe <= 0) {
				System.out.println("Mesafe pozitif olmalıdır.");
			}
			fiyat = mesafe*0.10;
			
			System.out.print("Yaşınızı giriniz : ");
			int yas = input.nextInt();
			if(yas <= 0) {
				System.out.print("Yaş pozitif olmalıdır.");
			}else if(yas<12 ) {
				indirim = fiyat*0.5;
				fiyat = fiyat - indirim;
			}else if(yas<24)
			{
				indirim = fiyat*0.10;
				fiyat = fiyat - indirim;
			}else if(yas>65) {
				indirim = fiyat*0.3;
				fiyat = fiyat - indirim;
			}
			
			
			
			System.out.print("Yolculuk tipini giriniz (1 ==> Tek yön, 2 ==> Gidiş-Dönüş) : ");
			char tip = input.next().charAt(0);
			System.out.println("Tip="+tip);
			if(tip != '1' && tip !='2') {
				System.out.println("Hatalı tip girdiniz!");
			}else {
				if(tip =='2') {
					indirim = fiyat*0.2;
					fiyat = 2*( fiyat - indirim);;
				}
			}
		} catch (Exception e) {
			System.out.println("Hatalı veri girdiniz! ");
		}
		
		
		System.out.println("Toplam tutar : "+fiyat+" TL");
		

	}

}
