import java.util.Scanner;

public class SumInterest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a<4)
		System.out.println("4");
	else {
	int sum=0;
	for(int i=a;i<a*a;i++)
	{
		sum=sum(i);
		if(sum%4==0)
		{
			System.out.println(i);
			break;
		}
	}
	}
}
static int sum(int a)
{
	int sum=0;
	while(a>0)
	{
		sum=sum+a%10;
		a/=10;
	}
	return sum;
}
}
