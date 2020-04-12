import java.util.Scanner;

public class SquaredSub {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try 
	{
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			long arr[]=new long[n];
			int pow[]=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=sc.nextLong();
				for(int a=1;a<=27;a++)
				{
					if(arr[j]%Math.pow(2,a)!=0)
						{
						pow[j]=a-1;
						break;
						}
					else if(arr[j]%Math.pow(2, a)==0)
					{}
				}
			}
			long res=0;
			for(int a=0;a<n;a++)
			{
				for(int p=a+1;p<=a;p++)
				{
				}
				
			}
			
			
		}
	}
	catch(Exception e)
	{}
}
}
