import java.util.Scanner;

public class Jumps {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++) {
	long sum=0;
		long a=sc.nextLong();
	long b=sc.nextLong();
	long k=sc.nextLong();
	if(k%2==0)
	{
		sum=sum+(k/2*a);
		sum=sum-=(k/2*b);
	}
	else if(k%2!=0)
	{
		sum=sum+(((k/2)+1)*a);
		sum=sum-(k/2*b);
	}
	System.out.println(sum);
	}
}
}
