package com.jsp.Patternspack;

import java.util.Scanner;

public class Rhombus
{
	
	public static void main(String [] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("enter a number");
		int n= scn.nextInt();
		
		int l=1;
		int s=n-1;
	    
		for(int i=1; i<=n;i++)
		{
			
			for(int j=1;j<=s;j++)
			{
				System.out.print(" ");
			
			}
			for (int j=1;j<=l; j++)
			{
				if(j==1||j==l||i==n||j==(l/2)+1) {
				System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			
			
			System.out.println();
			if (i<=n/2) 
			{	
			s--;
			l+=2;
			}else {
			s++;
			l-=2;
			}
		}
			
	}


}
