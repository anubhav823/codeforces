import java.util.Scanner;

public class Round {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int count=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int n=sc.nextInt();
		if(n>=1 && n<=9)
		{
			System.out.println(1);
			System.out.println(n);
		}
			
		else
		{
			a=n%10000;
			b=n1000;
			c=n/100;
			d=n/10;
			if(a>0)
				count++;
			if(b>0)
				count++;
			if(c>0)
				count++;
			if(d>0)
				count++;
			System.out.println(count);
			if(a>0)
				System.out.print(a+" ");
			if(b>0)
				System.out.print(b+" ");
			if(c>0)
				System.out.print(c+" ");
			if(d>0)
				System.out.print(d);
		}
	}
}
}
