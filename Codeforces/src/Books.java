import java.util.Arrays;
import java.util.Scanner;

public class Books {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	long t=sc.nextLong();
	long count=0;
	long arr[]=new long[(int)n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextLong();
	for(int i=0;i<n;i++)
	{
		if(t>arr[i])
		{
			t-=arr[i];
			System.out.println((t-arr[i])+" "+arr[i]);
			count++;
		}
		else
			{
			}
	}
		
	System.out.println(count);
}
}
	