import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//int[][] matris = new int[2][3];         2 satır 3 sütun
		
		int[][] matris = { {2,3,4},{5,6,4} };
		
		int matrisSatir = matris.length;
		int matrisSutun = matris[0].length;
		
		int[][] transpoze = new int[matrisSutun][matrisSatir];
		
/*
		matris[0][0] == matris[0][0]
		matris[0][1] == matris[1][0]
		matris[0][2] == matris[2][0]
		
		matris[1][0] == matris[0][1]
		matris[1][1] == matris[1][1]
		matris[1][2] == matris[2][1]
		

*/	
		for (int i = 0; i < transpoze.length; i++) {
			
			for (int j = 0; j < transpoze[0].length; j++) {
				transpoze[i][j] = matris[j][i];
			}
		}
		
		for (int[] is : transpoze) {
			for (int  i : is) {
				System.out.print(i+ "   ");
			}
			System.out.println();
			
		}
	}

}
