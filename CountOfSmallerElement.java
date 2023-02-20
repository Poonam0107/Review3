package com.review3;

public class CountOfSmallerElement {

	public static void main(String[] args) {
		int arr[] = {2,8,9,2,5};
		int smaller=arr[0];
		int count=0;
		for(int i=1;i<arr.length;i++)
		{
			
			
				if(arr[i]<smaller)
				{
					smaller=arr[i];
				}
		}
			System.out.println("Smaller element is :"+smaller);
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==smaller)
				{
					count=count+1;
				}
			}
			System.out.println("The smaller element" +count+ "times");
		}

	}


