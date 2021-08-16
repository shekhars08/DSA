package ArrayPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotate3 {

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
	    // Write your code here
	        while (d != 0) {
	                arr.add(arr.remove(0));
	                --d;
	        }
	        return arr;

	    }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the terms : ");
		int n = sc.nextInt();
		System.out.println();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the postion of rotation : ");
		int d = sc.nextInt();
		
		List<Integer> num = new ArrayList<>();
		for (int i = 0; i < n; i++) {
            int arrItem = arr[i];
            num.add(arrItem);
        }
        
        System.out.println("After Right Rotation by " +d +" position : ");
        List<Integer> result = rotateLeft(d, num);
        System.out.print(result);
        sc.close();
	}

}

//}
