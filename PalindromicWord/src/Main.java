import java.util.Scanner;

public class Main {

	static boolean isPalindrome(String arg) {
		String reverse ="";
		for (int i = arg.length()-1; i >= 0; i--) {
			reverse+=arg.charAt(i);
		}
		
		if(reverse.equals(arg)) {
			return true;
		}else
			return false;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Word : ");
		String word = input.nextLine();
		
		boolean check = isPalindrome(word);
		if(check) {
			System.out.println("It's a palindromic  word!");
		}else {
			System.out.println("It's not a palindromic word!");
		}
		
	}

}
