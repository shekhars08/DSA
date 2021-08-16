import java.util.Scanner;

public class ReverseArray2 {
	
	public static void reverse(int[] a) {
		
		
			int li = 0;
			int ri = a.length - 1;
			
			while(li < ri) {
				int temp = a[li];
				a[li] = a[ri];
				a[ri] = temp;
				li++;
				ri--;
			}
			for(int i=0; i<a.length; i++) {
				System.out.println(a[i]);
			}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of elements : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Arrar elements : ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Given array: ");
		for(int i=0; i<n; i++){
			System.out.println(a[i]);
		}
		
		System.out.println("Reverse array : ");
		
			reverse(a);
		
		
		sc.close();

	}

}
