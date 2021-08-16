package Sorting;

import java.util.Scanner;

public class ShellSort {
	
	static void shellSort(int arr[]) {
		
		int n = arr.length;
		for(int gap = n/2; gap > 0; gap /=2) {
			for(int i= gap; i<n; i++) {
				int temp = arr[i];
				int j=0;
				for(j=i; j>=gap && arr[j-gap]> temp; j -=gap) {
					arr[j] = arr[j-gap];
				}
				arr[j] = temp;
			}
			
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
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
		shellSort(a);
		sc.close();

		
	}

}
