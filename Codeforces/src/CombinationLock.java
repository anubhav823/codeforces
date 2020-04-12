import java.util.Scanner;

public class CombinationLock 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a=sc.next();
		String b=sc.next();
		char arr[]=a.toCharArray();
		char brr[]=b.toCharArray();
		int res=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			res=(int)(Math.abs(arr[i]-brr[i]));
			sum+=Math.min(10-res,res);
			res=0;
		}
		System.out.println(sum);
	}
}
