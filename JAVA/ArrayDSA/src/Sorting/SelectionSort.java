package Sorting;

import java.util.Scanner;

public class SelectionSort {
	
	static void selectionSort(int[] a) {
		
		for(int i=0; i<a.length-1; i++) {
			
			for(int j=i; j<a.length; j++) {
				if(a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int item : a) {
			System.out.print(item +" ");
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
		selectionSort(a);
		sc.close();

	}

}
