import java.util.Scanner;

public class ReverseArray {

	
	static void reverse(int[] a, int n) {
		int[] b = new int[n];
		int j =n;
		for(int i=0; i<n; i++) {
			b[j-1] = a[i];
			j--;
		}
		
		for(int i=0; i<n; i++) {
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
			
		}
		System.out.println();
		System.out.println("Reverse array : ");
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemrnt array : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		reverse(arr, n);
		sc.close();

	}

}
// https://www.geeksforgeeks.org/reverse-an-array-in-java/
