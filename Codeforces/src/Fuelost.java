import java.util.Scanner;

public final class Fuelost {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int v=sc.nextInt();
	int totReq=n-1;
	int rem=v;
	long cost=0;
	if(totReq>v)
	{
		cost=cost+v*1;
		totReq-=v;
		for(int i=2;i<=n;i++)
		{
			if(totReq>0)
			{
				cost=cost+i;
				totReq--;
			}
		}
	}
	else
	{
		cost=totReq;
	}
	System.out.println(cost);
}
}
