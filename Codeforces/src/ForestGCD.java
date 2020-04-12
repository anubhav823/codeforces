import java.util.Scanner;

public class ForestGCD {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long a=sc.nextLong();
	long b=sc.nextLong();
	long res=Math.min(a, b);
	System.out.println(factorial(res));
}
static long factorial(long a)
{
	long fac=1;
	for(int i=1;i<=a;i++)
		fac*=i;
	return fac;
}
}
