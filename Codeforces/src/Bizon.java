import java.util.Scanner;

public class Bizon {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int cups[]=new int[3];
	int sumcup=0;
	int summedal=0;
	int medals[]=new int[3];
	for(int i=0;i<3;i++)
	{
		cups[i]=sc.nextInt();
		sumcup+=cups[i];
	}
	for(int i=0;i<3;i++)
	{
		medals[i]=sc.nextInt();
		summedal+=medals[i];
	}
	int n=sc.nextInt();
	
		if(sumcup%5>0)
		{
			n--;
			n-=(sumcup/5);
		}
		else
		{
			n-=(sumcup/5);
		}
		if(summedal%10>0)
		{
			n--;
			n-=(summedal/10);
		}
		else
		{
			n-=(summedal/10);
		}
		if(n<0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
