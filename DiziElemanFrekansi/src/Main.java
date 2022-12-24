import java.util.Arrays;

public class Main {

	static int count(int[] arr, int value) {
		int counter = 0;
		for (int number : arr) {
			if(value==number) {
				counter++;
			}
		}
		return counter;
	}
	
	static boolean isThere(int[] arr, int value) {
		
		for (int number : arr) {
			if(number==value) {
				return true;
			}
		}
		
		return false;
	}
	static int countZero(int[] arr) {
		int counter = 0;
		for (int number : arr) {
			if(0==number) {
				counter++;
			}
		}
		return counter;
	}
	
	
	public static void main(String[] args) {
		int[] list = {10,20,20,10,10,20,5,20};
		System.out.println("Tekrar Sayıları\n--------------------");
		
		int[] checkedList = new int[list.length];
		int checked_indis = 0;
		
		int numberOfZero = countZero(list);
		
		for (int i = 0; i < list.length; i++) {
			
			if(!isThere(checkedList, list[i]))
			{
				checkedList[checked_indis++] = list[i];
			}
			
			
		}
		Arrays.sort(checkedList);
		
		for (int i : checkedList) {
			
			if(i == 0) {
				continue;
			}
			
			if(i!=0) {
				int total= count(list, i);
				System.out.println(i + " sayısı "+ total+" kere tekrar edildi.");
			
			}
		}
		
		

	}

}
