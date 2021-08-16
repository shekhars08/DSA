package Sorting;

import java.util.Scanner;

/*
   19  911  4  32    i=[2]
      
   current=[15]   j =[0] 
*/
public class InsertionsSort {
	
	static void insertionSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int current = a[i];
			int j = i-1;
			while(j>-1 && a[j]>current) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = current;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] =sc.nextInt();
		}
		System.out.println("Array before Sort : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.println("Array after sort : ");
		insertionSort(a);
		sc.close();

	}

}
