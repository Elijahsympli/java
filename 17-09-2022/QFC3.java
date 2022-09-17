
//WAP to count the number of letters in a file
package com.pack;

import java.io.FileInputStream;
import java.io.IOException;

public class QFC3 {
	public static void main(String args[]) throws IOException {
		FileInputStream fin=new FileInputStream("test.txt");
		
		
		int i=0,k=0;
		while((i=fin.read())!=-1 ) {if(i>=65 && i<=90 || i>=97 && i<=122 )
			k++;
		}
		System.out.print("the number of letters in a file is "+k);
		fin.close();
	}
}
