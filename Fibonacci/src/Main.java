import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int f1=0, f2=1,aktarma=0;
		Scanner input = new Scanner(System.in);
		System.out.print("f(n), n giriniz : ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(f1 + " + "+ f2+" = "+(f1+f2));
			aktarma = f2;
			f2=f1+f2;
			
			f1 = aktarma;
			
		}

	}

}
