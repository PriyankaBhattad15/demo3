package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=scan.nextInt();
		int a[]=new int[n];
		//inserting the values into array
		for(int i=0;i<=n-1;++i)
		{
			System.out.println("enter student "+(i+1)+" marks");
			a[i]=scan.nextInt();
		}
		
		//retreiving the values from array
		for(int i=0;i<=n-1;++i)
		{
			System.out.println("Student "+(i+1)+" marks is-->"+a[i]);
		}
	}

}
