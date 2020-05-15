	import java.util.Arrays;
	import java.util.Scanner;
	
	public final class Beecola {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x[]=new int[n];
		for(int i=0;i<n;i++)
			x[i]=sc.nextInt();
		Arrays.sort(x);
		int q=sc.nextInt();
		int sum[]=new int[q];
		long qarr[]=new long[q];
		long val=0;
		long ans=0;
		for(int i=0;i<q;i++)
		{
			qarr[i]=sc.nextLong();
		}
		for(int i=0;i<q;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(x[j]<=qarr[i])
					sum[i]++;
				else
					break;
			}
		}
		for(int i=0;i<q;i++)
			System.out.println(sum[i]);
	}
	}
