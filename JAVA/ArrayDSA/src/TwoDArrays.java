import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimentions : ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int a [][] = new int[rows][cols];
		int b [][] = new int[rows][cols];
		
		System.out.println("Enter the elements of matrix a :");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of matrix b :");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix a :");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix b :");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("NOW, Matrix c = [a]+b[b] ");
		int c[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Matrix c :");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
