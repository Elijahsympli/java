
/*Write a program in Java to make such a pattern like right angle triangle with number increased by 1.
The pattern like : 

1
2 3
4 5 6
7 8 9 10
*/

package com.java;



public class rightangtrinoinc1 {
	public static void main(String args[]){
		int s=1;
		for(int i=1;i<=4;i++) {
			int k=i;
			for(int j=i;k>=1;j++) {
				
				System.out.print(s+" ");
				k--;
				s=s+1;
			}
			System.out.println();
		}
		
	}
}
	
