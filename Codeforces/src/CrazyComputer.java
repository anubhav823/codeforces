import java.util.Scanner;

public class CrazyComputer {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=1;
	
	long c=sc.nextLong();
	long arr[]=new long[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextLong();
	if(n==1)
		System.out.println(count);
	else
		{
		for(int i=1;i<n;i++)
		
	{
		if(arr[i]-arr[i-1]<=c)
			count++;
		else
			count=1;
	}
	System.out.println(count);
}
}
}
