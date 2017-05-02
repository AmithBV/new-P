package qsp1;

import java.util.Scanner;

public class SwapNumber {
     
	public static void main(String[] args) {
		while(true){
		int a,b, temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println("Before swap");
	    System.out.println(+a);
	    System.out.println(+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swap");
		System.out.println(+a);
		System.out.println(+b);
		
		}

	}

     
		
	}



