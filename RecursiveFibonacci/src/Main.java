
public class Main {
	// 1 1 2 3 5 8 13 21 34 55
	// f(n) = f(n-1) + f(n-2)
	static int fib(int n) {
		if (n== 1 || n==2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		
		System.out.print(fib(8));
	}

}
