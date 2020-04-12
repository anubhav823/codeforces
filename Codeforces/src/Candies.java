import java.util.Scanner;

public class Candies {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int q=sc.nextInt();
	long sum=0;
	for(int i=0;i<q;i++)
	{
		for(int j=0;j<3;j++)
			sum+=sc.nextLong();
	if(sum%2==0)
		System.out.println(sum/2);
	else
	{
		sum--;
		System.out.println(sum/2);
	}
	sum=0;
	}
}
}
