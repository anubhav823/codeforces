import java.util.Scanner;

public class IceCream {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	long x=sc.nextLong();
	for(int i=0;i<n;i++)
	{
		char c=sc.next().charAt(0);
		long d=sc.nextLong();
		if(c=='+')
			x+=d;
		else if(c=='-')
		{
			if(d<=x)
				x-=d;
			else
				count++;
		}
	}
	System.out.println(x+" "+count);
}
}
