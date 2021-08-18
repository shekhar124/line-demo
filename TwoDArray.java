import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of rows and column");
	    int Row =  scan.nextInt();
		int column = scan.nextInt();
		int arr [][] =  new int[Row][column];
		System.out.println("entr elements of array");
		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = scan.nextInt();
				System.out.print(arr[i][j]+ " ");
		
			}
			
			System.out.println(" ");
		}
		scan.close();
	}

}
