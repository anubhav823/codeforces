import java.util.Scanner;

public class MultiTable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=sc.nextInt();
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(x%i==0 && x/i<=n)
		{
			count++;
		}
		else
		{}
	}
	System.out.println(count);
}
}
