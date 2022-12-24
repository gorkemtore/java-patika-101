public class Main {
	public static void main(String[] args) {
		String[][] karakter = new String[7][4];
		
		for (int i = 0; i < karakter.length; i++) {
			
			for (int j = 0; j < karakter[i].length; j++) {
				
				if((i== 1 ||i==2) && (j==1 || j==2) || (i==4 || i ==5) && (j==1 || j==2)) {
					karakter[i][j]="  ";
				}else {
					karakter[i][j]="* ";
				}
			}			
		}
		
		for (String[] row : karakter) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
			
		}
		
		
	}
}
