package Searching;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
	
	public static int[] sort(int temp[], int low, int high) {
		while(low < high) {
			int flag = temp[low];
			temp[low] = temp[high];
			temp[high] = flag;
			high--;
			low++;
		}
		return temp;
	}
	
	
	public static int getMedianOfTwoSortedArrays(int arr1[], int arr2[], int n1, int n2) {
		int n = n1 + n2;
		int temp[] = new int[n];
		for(int i=0; i<n1; i++) {
			temp[i] = arr1[i];
		}
		for(int i=n1; i<n; i++) {
			temp[i] = arr2[i];
		}
		sort(temp, 0, n);
		System.out.println("Sorted Array : ");
		for(int i=0; i<n; i++) {
			System.out.println(temp[i] +" ");
		}
		if(n%2 == 0) {
			return ((n/2 + n+1/2)/2);
		}
		else {
			return n/2;
		}
	}

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array's length : ");
		n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Enter first sorted array's elements : ");
		for(int i=0; i<n1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter second array's length : ");
		n2 = sc.nextInt();
		int arr2[] = new int[n2];
		System.out.println("Enter second sorted array's elements : ");
		for(int i=0; i<n2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Median is : ");
		
		getMedianOfTwoSortedArrays(arr1,arr2,n1,n2);
		sc.close();

	}

}
