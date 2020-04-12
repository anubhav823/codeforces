import java.util.Scanner;

public class RandomTeams {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	long m=sc.nextLong();
	long maxval=n-m+1;
	long mult=1;
	long sum=0;
	for(int i=(int)maxval;i>maxval-2;i--)	
		mult*=i;
	maxval=mult/2;
	
	long minval[]=new long[(int)m];
	while(n>0) {
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			minval[i]+=1;
			n--;
		}
		System.out.println(minval[i]);
	}
	
	for(int i=0;i<m;i++)
	{
		mult=1;
		for(int j=(int)minval[i];j>minval[i]-2;j--)
			mult*=j;
		sum+=(mult/2);
	}
	System.out.println(sum+" "+maxval);
	}
}
}