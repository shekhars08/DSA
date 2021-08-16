package ArrayPractice;

import java.util.Scanner;

public class Rotate4 {
	
	public static void main (String[] args) {
		//code
		int  n, d;
		Scanner sc = new Scanner(System.in);

			System.out.println("Number of terms : ");
		    n = sc.nextInt();
		    System.out.println("Number of rotation : ");
		    d = sc.nextInt();
		    int arr[] = new int[n];
		 
		    System.out.println("right rotation of test case : ");
		    for(int i=0; i<n; i++){
		        arr[(i+n-d)%n] =sc.nextInt();
		        
		    }
		    System.out.println(" After right rotation of test case : ");
		    for(int i=0; i<n;i++) {
		    	System.out.print(arr[i] +" ");
		    }
		    System.out.println();
		    
		    System.out.println("Left rotation of test case : ");
		    for(int i=0; i<n; i++){
		        arr[(i+d)%n] =sc.nextInt();
		    }
		    System.out.println(" After Left rotation of test case : ");
		    for(int i=0; i<n;i++) {
		    	System.out.print(arr[i] +" ");
		    }
	   
		sc.close();
	}

}
