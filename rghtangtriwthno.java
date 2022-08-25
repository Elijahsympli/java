/*Write a program in Java to display the pattern like right angle triangle with a number

Test Data
Input number of rows : 10
Expected Output :

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345
*/

package com.java;

public class rghtangtriwthno {
public static void main(String args[]){
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}System.out.println();
	}
	
}
}
