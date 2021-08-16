package ArrayPractice;

import java.util.Scanner;

public class Majority1 {
	
	public static int getMajority(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int cnt = 1;
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					cnt++;
				}
			}
			if(cnt > n/2)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n =sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}
		
		System.out.println("Mazority Elemnt in the array is ");
		System.out.println(getMajority(arr));
		sc.close();
	}

}
