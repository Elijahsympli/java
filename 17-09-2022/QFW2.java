
//WAP to read the data from two files and write it into another file
package com.pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class QFW2 {
	public static void main(String ags[]) throws IOException {
		FileInputStream fin=new FileInputStream("test.txt");
		FileInputStream fin2=new FileInputStream("test2.txt");
		SequenceInputStream inst=new SequenceInputStream(fin,fin2);
		FileOutputStream fout=new FileOutputStream("test3.txt");
		int i;
		while((i=inst.read())!=-1) {
		
			
			fout.write((char)i);
			
		}fout.close();
	}
}
