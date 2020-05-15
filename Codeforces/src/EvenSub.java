import java.util.Scanner;

public final class EvenSub {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int n=sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
			if(arr[j]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		if(evenCount>=1)
		{
			System.out.println("1");
			for(int a=0;a<n;a++)
			{
				if(arr[a]%2==0)
					{
					System.out.println(a+1);
						break;
					}
			}
		}
		else if(oddCount>=2)
		{
			int count=0;
			System.out.println("2");
			for(int a=0;a<n;a++)
			{
				if(arr[a]%2!=0 && count<2)
				{
					System.out.print((a+1)+" ");
					count++;
				}
				else if(count>=2)
					break;
			}
		}
		else
			System.out.println("-1");
	}
}	
}
