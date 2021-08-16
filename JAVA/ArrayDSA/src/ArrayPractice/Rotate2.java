package ArrayPractice;

import java.util.Scanner;

public class Rotate2 {
	public static void reverse(int arr[], int low , int high) {
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	
	
	public static void rotateArray(int arr[], int d) {
		int n = arr.length;
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		
		
		for(int i=0; i<n; i++){
			System.out.print(arr[i] +" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the terms : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the postion of rotation : ");
		int d = sc.nextInt();
		System.out.println("After Left Rotation : ");
		rotateArray(arr,d);
		sc.close();

	}

}
