import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Suffixes {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int K=sc.nextInt();
	int arr[]=new int[100005];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int dp[]=new int[100005];
	boolean visited[]=new boolean[100005];
	for(int i=n-1;i>=0;i--)
	{
		if(visited[arr[i]]==false)
		{
			
			dp[i]=1;
		}
		visited[arr[i]]=true;
		}
	for(int i=n-1;i>=0;i--)
		dp[i]+=dp[i+1];
	for(int i=0;i<K;i++)
	{
		int a=sc.nextInt();
		System.out.println(dp[a-1]);
	}
	
	
}
}
