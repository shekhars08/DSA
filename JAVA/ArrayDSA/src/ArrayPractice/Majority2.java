package ArrayPractice;

import java.util.Scanner;

public class Majority2 {
	
	public static int getMajority(int arr[]) {
		int n = arr.length;
		int res = 0, cnt = 1;
		for(int i=1; i<n; i++) {
			if(arr[res] == arr[i]) 
				cnt++;
			else
				cnt--;
			if(cnt == 0) {
				cnt = 1;
				res = i;
			}
		}
		cnt =0;
		for(int i=0; i<n; i++) {
			if(arr[res] == arr[i]) 
				cnt++;
			if(cnt > n/2)
				return arr[res];
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
		
		System.out.println("Mazority element in the array is ");
		System.out.println(getMajority(arr));
		sc.close();

	}

}
