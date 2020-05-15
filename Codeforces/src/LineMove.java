import java.util.Scanner;

public class LineMove {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long x[]=new long[n];
	for(int i=0;i<n;i++)
		x[i]=sc.nextLong();
	long min=99999;
	long max=0;
	for(int a=0;a<n;a++)
	{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
			{}
			else
			{
				min=Math.min(min, Math.abs(x[j]-Math.abs(x[i])));
				max=Math.max(max, Math.abs(x[j]-Math.abs(x[i])));
			}
		}
	}
}
}
}
