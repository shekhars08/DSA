package ArrayPractice;
import java.util.*;

public class RemoveDuplicate {
	
	public static int getRemove(int arr[]) {
		int n = arr.length;
		int res = 1;
		for(int i=1; i<n; i++) {
			if(arr[res-1] != arr[i]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the terms : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
	
		System.out.println("Before Removal : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println();
		int res = getRemove(arr);
		System.out.println("After Removal : ");
		for(int i=0; i<res; i++) {
			System.out.print(arr[i] +" ");
		}
		sc.close();
	}

}
