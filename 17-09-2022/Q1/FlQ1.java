
//WAP to print vowels from a text file
package com.pack;

import java.io.FileInputStream;

import java.io.IOException;

public class FlQ1 {
	public static void main(String args[]) throws IOException {
	FileInputStream fin=new FileInputStream("test.txt");
	
	
	int i=0;
	while((i=fin.read())!=-1 ) {
		if(((char)i=='a' || (char)i=='e'|| (char)i=='i'|| (char)i=='o'|| (char)i=='u'|| (char)i=='A'|| (char)i=='E'|| (char)i=='I'|| (char)i=='O'|| (char)i=='U'))
		System.out.println((char)i);
	}
	fin.close();
}
}
