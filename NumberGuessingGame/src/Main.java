import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many tries would you like to make : ");
		int right = input.nextInt();
		
		Random rnd = new Random();
		int number = rnd.nextInt(0,100);//100 is out of range.
		
		
		int[] tries = new int[right];
		//System.out.println("number : "+number);
		
		
		for (int i = 0; i < right; i++) {
			System.out.print("Guess the number : ");
			int guess = input.nextInt();
			tries[i] = guess;
			
			if(guess == number) {
				System.out.println("You succeeded !");
				break;
			}else if(guess >number) {
				System.out.println("Down...");
			}else if(guess <number) {
				System.out.println("Up...");
			}
			
			if ((right-i-1)==0){
				System.out.println("You lost. Number was : "+number);
				
			}else {
				System.out.println("Remaining right : "+(right-i-1));
			}	
		}
		System.out.println("Your tries : "+ Arrays.toString(tries));

	}

}
