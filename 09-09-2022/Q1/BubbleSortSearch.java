/*
WAP to input an array in random order and then sort it using 
bubble sort and then search for a given element from that sorted array
 */
package com.Junit_Testing;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
	
int arr[]= {4,2,1,3,5},tarr[]= {0};
for(int i=0;i<arr.length;i++) {

	System.out.print(arr[i]+" ");

}System.out.println();
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			tarr[0]=arr[i];
			arr[i]=arr[j];
			arr[j]=tarr[0];
		}
		
		
	}
	
	
}for(int i=0;i<arr.length;i++) {

		System.out.print(arr[i]+" ");
	
}System.out.println();

System.out.println("enter Number to check its present in an array:");
int search=sc.nextInt();
for(int i=0;i<arr.length;i++) {
if(search==arr[i]) {
	

	System.out.print(arr[i]+" present  ");
	break;
	
}else if (arr.length==i+1 && search!=arr[i]) {
	System.out.print(" not present  ");
	
}

}

	}
}
/*
1. Take an array
2.Use two loops -> one loop for iteration and another loop for comparing
values
3.While comparing, if the lower index value is greater than higher index value then swap them
4.Finally print the sorted array.
*/
