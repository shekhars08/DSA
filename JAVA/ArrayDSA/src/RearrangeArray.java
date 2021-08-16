import java.util.Scanner;
// In the given array element is present other than -1, then convert a[i] to i
public class RearrangeArray {
	
	public static void rearrangeArr(int arr[]) {
		
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != -1) {
				temp = arr[i];
				arr[i] = i;
				temp = 0;
			}
			System.out.println(temp);
			System.out.println(arr[i]);
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the Array elements ");
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Given array :");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Rearranged Array is : ");
		rearrangeArr(arr);
		sc.close();
	}

}
