import java.util.Scanner;

public class MaxIncrease {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long count=1;
	long finalCount=1;
	long arr[]=new long[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextLong();
	for(int i=0;i<n-1;i++)
	{
		if(arr[i+1]>arr[i])
		{
			count++;
			finalCount=Math.max(finalCount,count);
		}
		else
		{
			
			count=1;
		}
		
	}
System.out.println(finalCount);
}
}

