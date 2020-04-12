import java.util.Scanner;

public class OddArray {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int a=sc.nextInt();
		int countOdd=0;
		long sum=0;
		int countEven=0;
		for(int j=0;j<a;j++)
		{
			int b=sc.nextInt();
			sum+=b;
			if(b%2!=0)
				countOdd++;
			else
				countEven++;
		}
		if(sum%2==0)
		{
			if(countOdd>0 && countEven>0)
				System.out.println("YES");
			else
				System.out.println("NO");		
		}
		else if(sum%2!=0)
			System.out.println("Yes");
		
	}
}
}
