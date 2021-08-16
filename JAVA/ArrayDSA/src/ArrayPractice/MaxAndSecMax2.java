package ArrayPractice;
import java.util.*;

public class MaxAndSecMax2 {
	
	public static ArrayList<Integer> maxAndSecMax(int arr[]){
		ArrayList<Integer> num = new ArrayList<Integer>();
		int max = arr[0];
		int sec = -1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				sec = max;
				max = arr[i];
			}
			else if(max != arr[i]) {
				if(sec == -1 || arr[i] > sec) {
					sec = arr[i];
				}
			}
		}
		if(max != sec) {
			num.add(max);
			num.add(sec);
		}
		else {
			num.add(max);
			num.add(-1);
		}
		return num;
	}

	public static void main(String[] args) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array elements : ");
		for(int i= 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
		res = maxAndSecMax(arr);
		System.out.println();
		System.out.println("Max = " +res.get(0));
		System.out.println("Second Max = " +res.get(1));
		sc.close();

	}

}
