/*Write a Java program that takes the user to provide a single character from the alphabet. 
  Print Vowel or Consonant, depending on the user input. If the user input is not a letter
  (between a and z or A and Z), print an error message*/
package com.java;

import java.util.Scanner;

public class consoorletter {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a letter");
char ch=sc.next().charAt(0);
int j=ch;
//if(!(ch>='a' && ch<='z' || ch>='A' && ch<='Z') ) 
if(j>=65 && j<=90 || j>=97 && j<=122 ) {

if(ch=='A' || ch=='a'  || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
	System.out.println(" its  a vowel");

else 	
	System.out.print("its a consonant");
	

}
else 
	System.out.println("Error ");




}
}


