package Sorting;

import java.util.Scanner;

public class QuickSort {
	
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// Used Lomuto Partition 
	static int partition(int arr[], int l, int r) {
		int pivot = arr[r];
		int i = l-1;
		
		for(int j=l; j<r; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i,j);
			}
		}
		swap(arr, i+1,r);
		return i+1;
	}
	
	static void quickSort(int arr[], int l, int r) {
		
		if(l<r) {
			int pi = partition(arr, l, r);
			quickSort(arr, l, pi-1);
			quickSort(arr, pi+1, r);
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
		quickSort(a, 0, n-1);
		for(int item: a) {
			System.out.print(item +" ");
		}
		sc.close();

		

	}

}
