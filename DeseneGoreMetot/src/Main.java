import java.util.Scanner;

public class Main {
	
	static int sayac = 0;
	static int sayacAktarma=5;
	
	static void desen(int n) {
		System.out.print(n+ " ");
		if(sayac <5) {
			if(n >= -5) {
				n-=5;
				sayac++;
				desen(n);	
			}
		}
		if(sayac==5 && sayacAktarma !=0) {
			n+=5;
			sayacAktarma--;
			
			desen(n);
			
			if(sayacAktarma==0) {
				sayac = 0;
			}
		}	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("n : ");
		int n = s.nextInt();
		
		desen(n);

	}

}
