
public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("Hasan",10,120,100,20);
		Fighter f2 = new Fighter("Mehmet",20,85,85,10);
		
		Match match = new Match(f1,f2,85,110);
		match.run();

	}

}

