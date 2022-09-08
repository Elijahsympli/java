package com.Junit_Testing;

public class MainBinarySearchEle {
	public static void main(String args[]){
		BinarySearchEle a=new BinarySearchEle();
        int arr[] = {1,2,3,4,5};  
        int find = 5;  
        int last=arr.length-1;  
        System.out.println(a.binarySearch(arr,0,last,find));     
 }  
}
