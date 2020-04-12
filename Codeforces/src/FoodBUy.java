import java.util.Scanner;

public class FoodBUy {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		long n=sc.nextLong();
		long ans=0;
		while(n>0) {
			int j=1000000000;
		while(n<j)
		{
			j=j/10;
		}
		ans=ans+j;
		n-=(j-j/10);
		}
	System.out.println(ans);
	}
	}
	}