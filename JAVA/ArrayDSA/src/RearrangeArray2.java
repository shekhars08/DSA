import java.util.Scanner;

public class RearrangeArray2 {
	public static void ckeckPossible(int arr[]) {
		
		int j=0;
		for(int i=1; i<arr.length; i+=2) {
			if(arr[i] %2 == 0) {
				continue;
			}
			else {
				while(j<arr.length && arr[j] %2 !=0) {
					j+=2;
				}
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
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
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		System.out.println("Required Array : ");
		
		ckeckPossible(arr);
		sc.close();

	}

}
