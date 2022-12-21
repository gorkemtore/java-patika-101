
import java.util.*;
import java.io.*;

class Main{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("t: ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
        	System.out.print("a: ");
            int a = in.nextInt();
            System.out.print("b: ");
            int b = in.nextInt();
            System.out.print("c: ");
            int n = in.nextInt();     
            int seri=0;
            for (int j = 0; j < n; j++) {

            	seri += (int) Math.pow(2, j)*b; 
				System.out.print(a+seri+" ");
			}
            System.out.println();  
        }
        
    }
}