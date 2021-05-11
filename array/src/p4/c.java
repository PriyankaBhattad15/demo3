package p4;

public class c {

	public static void main(String[] args) {
	int n=5,i,j;
	int count=n*(n+1)/2;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++) {
			if(count<=9)
			System.out.print("0"+count--+"");
			else

			System.out.print(count--+"");
		
		
	}
		System.out.println();

}
}
}

