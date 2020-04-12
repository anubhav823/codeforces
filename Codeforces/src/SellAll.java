import java.util.Arrays;
import java.util.Scanner;

class SellAll{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int t=sc.nextInt();
			for(int a=0;a<t;a++)
			{
				int N=sc.nextInt();
				long sum=0;
				long count=0;
				long P[]=new long[N];
				for(int i=0;i<N;i++)
					P[i]=sc.nextLong();
				Arrays.sort(P);
				for(int i=N-1;i>=0;i--)
				{
					if(P[i]==0) {
						
					break;
					}
					else if(P[i]>0 && (P[i]-count)>=0)
					{
						sum+=P[i]-count;
						count++;
					}
					else if(P[i]>0 && (P[i]-count)<0)
							{
							break;
							}
				}
				System.out.println(sum%1000000007);
				count=0;
			}
		}
		catch(Exception e)
		{}
	}
}