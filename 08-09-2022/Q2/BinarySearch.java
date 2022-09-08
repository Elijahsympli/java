package com.Junit_Testing;

class BinarySearch{  
	
	 
	 public static void main(String args[]){  
	        int arr[] = {1,2,3,4,5};  
	        int find = 5,first=0;  
	        int last=arr.length-1;  
	        
	            int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( arr[mid] < find ){  
	        first = mid + 1;     
	      }else if ( arr[mid] ==find ){  
	        System.out.println("Element is found at index: " + mid);  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   }  
	 }  
	 }  
	
