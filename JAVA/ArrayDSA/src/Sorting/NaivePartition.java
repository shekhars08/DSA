package Sorting;

import java.util.Scanner;

public class NaivePartition {
	
	public static void partition(int arr[], int l, int h, int p) {
		int temp[] = new int[h-l+1];
		int index = 0;
		for(int i=l; i<h; i++) {
			if(arr[i] <= arr[p] && i != p) {
				temp[index] = arr[i];
				index++;
			}
		}
		temp[index++] = arr[p];
		
		for(int i=l; i<=h; i++) {
			if(arr[i] > arr[p]) {
				temp[index] = arr[i];
				index++;
			}
		}
		for(int i=l; i<=h; i++) {
			arr[i] = temp[i-l];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array :"); 
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array :");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("After the partition : ");
		
		
		partition(arr, 0, n-1, n-1);
		for(int x : arr)
			System.out.print(x +" ");
		
		sc.close();

	}

}
