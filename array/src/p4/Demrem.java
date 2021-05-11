package p4;

import java.util.Scanner;

public class Demrem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		int b[]=new int[size-1];
		System.out.println("enter the elements to be stored in array");
		for(int i=0;i<size;i++) 
		{
			a[i]=scan.nextInt();
			
		}
		System.out.println("enter the element to be deleted from array");
		int element=scan.nextInt();
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(element!=a[i])
			{
				b[k]=a[i];
			    k++;
			}
		}
		System.out.println("After deleting"+element+ "Element");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}
