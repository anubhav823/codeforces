import java.util.Scanner;

public class Lottery {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	long count=0;
	while(n>0)
	{
		if(n>=100)
		{
			count=count+n/100;
			n%=100;
		}
		else if(n>=20)
		{
			count+=n/20;
			n%=20;
			}
		else if(n>=10)
		{
			count+=n/10;
			n%=10;
			}
		else if(n>=5)
		{
			count+=n/5;
			n%=5;
			}
		else
		{	count+=n;
			n=0;
			}
	}
	System.out.println(count);
}
}
