package ArrayPractice;

import java.util.Scanner;

//Naive Solution
//Max and Second Largest Element (return indexes)

public class MaxAndSecondMax1 {
	
	public static int getLargest(int arr[]) {
		int n = arr.length;
		int largest = 0;
		for(int i=1; i<n; i++) {
			if(arr[i] > arr[largest]) {
				largest = i;
			}
		}
		return largest;
	}
	
	public static int getSecondLargest(int arr[]) {
		int n = arr.length;
		int largest = getLargest(arr);
		int res = -1; 
		for(int i=0; i<n; i++) {
			if(arr[i] != arr[largest]) {
				if(res == -1) {
					res = i;
				}
				else if(arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		System.out.println("Largest Element index : " +largest);
		System.out.println("Largest Element is " +arr[largest]);
		System.out.println("Second Largest Element is : " +arr[res]);
		return res;
	}

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements in the Array : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("Second Largest Element Index : " +getSecondLargest(arr));
		
		sc.close();
	}

}
