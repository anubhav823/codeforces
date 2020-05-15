import java.util.Scanner;

public class Fences {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	long sum=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	int dp[]=new int[n-k+1];
	for(int i=0;i<k;i++)
		dp[0]=dp[0]+arr[i];
	for(int i=1;i<=n-k;i++)
	{
		dp[i]=dp[i-1]-arr[i-1]+arr[k+i-1];
	}
	int min=dp[0];
	int val=0;
//	for(int i=0;i<dp.length;i++)
//		System.out.println(dp[i]);
	if(arr.length==1)
		System.out.println(1);
	else {
	for(int i=1;i<dp.length;i++)
	{
		if(dp[i]<min)
		{
			min=dp[i];
			val=i;
		}
	}
	System.out.println(val+1);
}
}
}
