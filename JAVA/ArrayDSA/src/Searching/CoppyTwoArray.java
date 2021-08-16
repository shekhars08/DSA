package Searching;

import java.util.Arrays;
import java.util.Scanner;



public class CoppyTwoArray {
	
	public static void copy(int arr1[], int arr2[], int n1, int n2) {
		int n = n1 + n2;
		int temp[] = new int[n];
		for(int i=0; i<n1; i++) {
			temp[i] = arr1[i];
		}
		for(int i=n1; i<n; i++) {
			temp[i] = arr2[i];
		}
		Arrays.sort(temp);
		System.out.println("Sorted Array : ");
		for(int i=0; i<n; i++) {
			System.out.println(temp[i] +" ");
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
		copy(arr1,arr2,n1,n2);
		
		sc.close();

	}

}
