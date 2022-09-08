/*
write a java program to input an array and use  a method which is having
the array and the searched element in argument.Search the element
using binary search and if element is found return true otherwise return false.
*/
package com.Junit_Testing;

public class BinarySearchEle {

 
	boolean binarySearch(int arr[], int first, int last, int find){  
	   int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( arr[mid] < find ){  
	        first = mid + 1;     
	      }else if ( arr[mid] == find ){  
	        return true;
	        
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      return false; 
	   }
	return true;  
	 }  
	 
	}  