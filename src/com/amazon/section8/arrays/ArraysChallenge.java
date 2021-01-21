package com.amazon.section8.arrays;
import java.util.*;

public class ArraysChallenge {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr_ip;
		System.out.println("Enter number of inputs: ");
		int n = sc.nextInt();
		arr_ip = getIntegers(n);
		printArray(arr_ip);
		int[] sortedArray = Arrays.copyOf(arr_ip, n);
		desc_sort(sortedArray);
		printArray(sortedArray);
		printArray(arr_ip);
	}
	
	public static int[] getIntegers(int n) {
		System.out.println("Enter "+n+" numbers:");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println("Element "+i+" = "+arr[i]);
	}
	public static void desc_sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int j=i, item = arr[i+1];
			while(j>=0 && arr[j]<item )
				arr[j+1] = arr[j--];
			arr[j+1] = item;
		}
	}
}
