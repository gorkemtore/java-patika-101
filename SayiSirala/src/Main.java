import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi1,sayi2,sayi3,enBuyuk,enKucuk,ortanca = 0;
		System.out.print("Sayı 1: ");
		sayi1 = input.nextInt();
		System.out.print("Sayı 2: ");
		sayi2 = input.nextInt();
		System.out.print("Sayı 3: ");
		sayi3 = input.nextInt();
		
		if(sayi1 > sayi2 && sayi1 > sayi3) {
			enBuyuk = sayi1;
		}else if(sayi2 > sayi1 && sayi2 > sayi3) {
			enBuyuk=sayi2;
		}else {
			enBuyuk=sayi3;
		}
		
		if(sayi1 < sayi2 && sayi1 < sayi3) {
			enKucuk = sayi1;
		}else if(sayi2 < sayi1 && sayi2 < sayi3) {
			enKucuk=sayi2;
		}else {
			enKucuk=sayi1;
		}
		
		if(sayi1 != enKucuk && sayi1 != enBuyuk) {
			ortanca = sayi1;
		}else if(sayi2 != enKucuk && sayi2 != enBuyuk) {
			ortanca = sayi2;
		}else if(sayi3!= enKucuk && sayi3 !=enBuyuk){
			ortanca = sayi3;
		}
		
		System.out.println(enBuyuk + ">"+ortanca+">"+enKucuk);

	}

}
