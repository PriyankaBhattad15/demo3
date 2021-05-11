package p3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of schools");
		int sh=scan.nextInt();
		int a[][][]=new int[sh][][];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the number of class for"  +(i+1)+  "Schools");
			int cr=scan.nextInt();
			a[i]=new int[cr][];
			for(int j=0;j<a[i].length;j++) 
			{
				
					System.out.println("enter the number of student for"  +(j+1)+  "class");
					int st=scan.nextInt();
					a[i][j]=new int[st];
					for(int k=0;k<a[i][j].length;k++)
					{
					}
			}
		}
	
		//inserting the elements from array
		for(int i=0;i<a.length;i++)
		{
			System.out.println("School"  +(i+1)+  "details");
			for(int j=0;j<a[i].length;j++)
				{
					System.out.println("classroom"  +(j+1)+  "details");
					for(int k=0;k<a[i][j].length;k++)
					{
						System.out.println("enter the marks of student"  +(k+1));
						a[i][j][k]=scan.nextInt();
					}
				}
			}
			//Retrieving the data elements from array
			for(int i=0;i<a.length;i++)
			{
				System.out.println("School" +(i+1)+ "details");
				for(int j=0;j<a[i].length;j++)
					{
						System.out.println("classroom" +(j+1)+ "details");
						for(int k=0;k<a[i][j].length;k++)
						{
							System.out.println(" the marks of student" +(k+1)+ "is-->" +a[i][j][k]);
						}
						System.out.println();
					}
					System.out.println();
				}
			}
		}

				