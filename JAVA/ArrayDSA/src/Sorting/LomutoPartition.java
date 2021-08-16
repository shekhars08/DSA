package Sorting;

import java.util.Scanner;

// In this we use lomuto partition to partition the array
/* Procedure :
 (i) In the array first we take last element of the array as pivot 
 (ii) Then we put i = low-1, and put elements which is smaller than pivot left of the pivot and greater than pivot will be in right of the pivot.
 (iii) Further this partition will be used in quick sort
 */

public class LomutoPartition {
	
	public static int lpartition(int arr[], int l, int h) {
		int pivot = arr[h];
		int i = l-1;
		for(int j=l; j<=h-1; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		return i+1;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			a[i] =sc.nextInt();
		}
		System.out.println("Array elments are : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		System.out.println("After the partition : ");
		System.out.println(lpartition(a, 0, n-1));
		System.out.println("Now update array is :");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();

	}

}
