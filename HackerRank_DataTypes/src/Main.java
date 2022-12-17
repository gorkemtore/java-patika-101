import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();
        
		for(int i=0;i<t;i++)
        {
            try
            {
                
            	long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                	
                	System.out.println("* byte");
                }
                if(x>= Math.pow(-2, 15) && x< Math.pow(2, 15) ) {
                	
                	System.out.println("* short");
                }
                if(x>= Math.pow(-2, 31) && x < Math.pow(2, 31) ) {
                	System.out.println("* int");

                }
                if(x>= Math.pow(-2, 63) && x<=Math.pow(2, 63) ) {
                	System.out.println("* long");

                }
                
                
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
		

        }

	}
}
