package Sorting;

import java.util.Scanner;

public class BubbleSort {
	
	
	static void bubleSort(int[] arr) {
		boolean sorted = true;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
		for(int item : arr) {
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
		bubleSort(a);
		sc.close();

	}

}
