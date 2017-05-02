package qsp1;

import java.util.Scanner;

public class PrimeNumber 
{

public static void main(String[] args) 
{
		while(true)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Num");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<(n/2);i++)
		{
			
			if(n%i==0)
			{
				count++;
				
			}
		}
		if(count<2)
		{
			System.out.println("Prime no.");
		}
		else
			System.out.println("Not a Prime no.");
		
	}
	}


}	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


