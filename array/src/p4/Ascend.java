package p4;

import java.util.Scanner;

public class Ascend {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		int temp=0;
		System.out.println("enter the elements to be swapped");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}

