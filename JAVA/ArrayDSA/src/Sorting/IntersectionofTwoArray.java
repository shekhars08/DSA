package Sorting;
import java.util.*;

// Print the two common elements

public class IntersectionofTwoArray {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of 1st array :");
		int m  = sc.nextInt();
		System.out.println("Enter the length of 2nd array :");
		int n = sc.nextInt();
		
		int a[] = new int[m];
		int b[] = new int[n];
		
		System.out.println("Enter the 1st array :");
		for(int i=0; i<m; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the 2nd array :");
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println("Sorted array 1 : ");
		for(int i=0; i<m; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		
		Arrays.sort(b);
		System.out.println("Sorted array 2 : ");
		for(int i=0; i<n; i++) {
			System.out.print(b[i] +" ");
		}
		
		sc.close();

	}

}
