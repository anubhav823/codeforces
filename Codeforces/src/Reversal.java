import java.util.Scanner;

public class Reversal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext())
	{
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=sc.nextLong();
			long rem=0;
			long val=0;
			while(n>0)	
			{
				rem=n%10;
				val=val*10+rem;
				n/=10;
			}
			System.out.println(val);
		}
	}
}
}
