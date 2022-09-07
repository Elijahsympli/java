package com.Junit_Testing;

public class MaxVinARR {
	public int Max(){
		int arr[]={12,67,9,10},ar[]= {0};
		for (int i=0;i<=3;i++) {
			
			if(ar[0]>arr[i]) {
				ar[0]=ar[0];
			}
			else {
				ar[0]=arr[i];
			}
			
		}
		return ar[0];
		
	}

}
