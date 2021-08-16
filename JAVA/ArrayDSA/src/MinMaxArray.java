import java.util.Scanner;

public class MinMaxArray {
	
	public static void minmax(int[] arr) {
		
		int max = 0;
		int min = 0;
		int x =0, y =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]< min) {
				min = arr[i];
				x = i;
				
			}
			if(arr[i] > max) {
				max = arr[i];
				y = i;
			}
		}
		System.out.println();
		System.out.println("Minimum element in the array is " +min +" at " +x);
		
		System.out.println("Maximum element in the array is " +max +" at " +y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Array elements are");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		
		//calling function
		minmax(arr);
		sc.close();

	}

}
