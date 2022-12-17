import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			
			int math, english, history, art, music;
			
			System.out.print("Matematik notunuz: ");
			math = input.nextInt();
			
			System.out.print("İngilizce notunuz: ");
			english = input.nextInt();
			
			System.out.print("Tarih notunuz: ");
			history = input.nextInt();
			
			System.out.print("Sanat notunuz: ");
			art = input.nextInt();
			
			System.out.print("Müzik notunuz: ");
			music = input.nextInt();
			
			double average = (math + english + history + art + music) / 5;
			//System.out.print("Not ortalaması = "+ average);
			
			String controlPass = average > 50 ? "You passed!" : "You failed";
			System.out.println(controlPass+ "\nNot ortalaması = "+ average);
			
		}
	}

}