package Sorting;

import java.util.Scanner;

public class MergeSort {
	
	public static void merge(int arr[], int l, int mid, int  r) {
		
		int n1 = mid-l+1;
		int n2 = r - mid;
		
		int x[] = new int[n1+1];
		int y[] = new int[n2+1];
		
		for(int i=0; i<n1; i++) {
			x[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			y[j] = arr[mid+1+j];
		}
		x[n1] = Integer.MAX_VALUE;
		y[n2] = Integer.MAX_VALUE;
		
		
		
		int i=0, j=0;
		
		for(int k=l; k<=r; k++) {
			if(x[i] <= y[j]) {
				arr[k] = x[i];
				i++;
			}
			else {
				arr[k] = y[j];
				j++; 
			}
		}
		
		
	}
	
	
	public static void mergeSort(int[] arr, int l, int r) {
		
		if(l < r) {
			int mid = (l+r)/2; 
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
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
		mergeSort(a, 0, n-1);
		for(int i=0; i<n; i++) {
			System.out.print(a[i] +" ");
		}
		
		sc.close();

	}

}
