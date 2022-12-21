import java.util.Scanner;

public class Main{

	static void print(String metin) {
		System.out.print(metin);
	}
	
	static void topla() {
		int i=1, sayi, toplam =0;
		Scanner s = new Scanner(System.in);
		while (true){
			print(i++ +". sayı : ");
			sayi = s.nextInt();
			if(sayi != 0) {
				toplam+=sayi;
			}else break;
		}
		
		System.out.println("Sonuç : "+toplam);
	}
	
	static void cikar() {
		Scanner s = new Scanner(System.in);
		int adet, sayi, sonuc=0;
		print("Kaç adet sayı gireceksiniz : ");
		adet=s.nextInt();
		
		for(int i = 1; i <= adet;i++) {
			print(i+". sayı : ");
			sayi=s.nextInt();
			if(i == 1) {
				sonuc += sayi;
				continue;
			}else {
				sonuc -=sayi;
			}
		}
		print("Sonuç : "+sonuc+"\n");
	}
	
	static void carp() {
		Scanner s  = new Scanner(System.in);
		int sayi, sonuc=1,i=1;
		
		while(true) {
			print(i++ +". sayı :");
			sayi = s.nextInt();
			
			if(sayi == 1) // 1 yazarsa döngü biter.
				break;
			if(sayi == 0) {
				sonuc = 0;
				break;
			}
			sonuc *= sayi;
		}
		print("Sonuç : "+sonuc+"\n");
		
	}
	
	static void bol() {
		Scanner s = new Scanner(System.in);
		print("Kaç adet sayı gireceksiniz : ");
		int adet = s.nextInt();
		double sayi, sonuc =0;
		
		for (int i = 1; i <= adet; i++) {
			print(i+". sayı : ");
			sayi = s.nextDouble();
			
			if(i != 1 && sayi == 0) {
				print("Bir sayıyı sıfıra bölemezsiniz. \n");
				i--;
				continue;
			}
			if(i==1) {
				sonuc = sayi; 
				continue;
			}
			sonuc /= sayi;
		}
		print("Sonuç : "+sonuc+"\n");
		
	}
	
	static void usBul() {
		int taban, us, sonuc=1;
		Scanner s = new Scanner(System.in);
		print("Taban: ");
		taban = s.nextInt();
		print("Üs: ");
		us = s.nextInt();
		
		for(int i = 1; i<=us;i++) {
			sonuc*=taban;
		}
		print("Sonuç : "+sonuc+"\n");
	}
	
	static void faktoriyel() {
		Scanner s = new Scanner(System.in);
		print("Faktoriyeli alınacak sayı : ");
		int sayi = s.nextInt();
		int sonuc=1;
		for (int i =1; i<=sayi;i++) {
			sonuc*=i;
		}
		print("Sonuç : "+sonuc+"\n");
	}
	
	static void mod() {
		
	}
	
	public static void main(String[] args) {
		
		  Scanner s = new Scanner(System.in);
	        int select;
	        String menu = "1- Toplama İşlemi\n"
	                + "2- Çıkarma İşlemi\n"
	                + "3- Çarpma İşlemi\n"
	                + "4- Bölme işlemi\n"
	                + "5- Üslü Sayı Hesaplama\n"
	                + "6- Faktoriyel Hesaplama\n"
	                + "7- Mod Alma\n"
	                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
	                + "0- Çıkış Yap";

	        do {
	            System.out.println(menu);
	            System.out.print("Lütfen bir işlem seçiniz :");
	            select = s.nextInt();
	            switch (select) {
	                case 1:
	                    topla();
	                    break;
	                case 2:
	                    cikar();
	                    break;
	                case 3:
	                    carp();
	                    break;
	                case 4:
	                    bol();
	                    break;
	                case 5:
	                    usBul();
	                    break;
	                case 6:
	                    faktoriyel();
	                    break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
	            }
	        } while (select != 0);

		
	}
}