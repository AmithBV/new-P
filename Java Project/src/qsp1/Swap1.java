package qsp1;

import java.util.Scanner;

public class Swap1 {
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
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap");
		System.out.println(+a);
		System.out.println(+b);
		
		}

	}

     
		
	}


