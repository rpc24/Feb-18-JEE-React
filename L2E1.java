package com.cg.feb22.demo;

import java.util.Scanner;

public class L2E1 {

		public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
		public static void main(String args[]){  
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Second smallest: "+getSecondSmallest(a,n));  
		 
		}}  
