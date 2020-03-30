package org.test;


public class InsertionSort {
void sort(int arr[]) {
	int n=arr.length;
	for(int i=1;i<n;i++) {
		
			int key=arr[i];
			int j=i-1;
			
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
		  arr[j+1]=key;
		}
}
	static void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+ " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[]={12,11,7,4,20,14};
		InsertionSort ob= new InsertionSort();
		ob.sort(arr);
		
		printArray(arr);
	}
	}
