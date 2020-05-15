import java.util.Scanner;

public final class Walks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int count=0;
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			if((arr[i]+arr[i+1])>=k)
			{}
			else
			{
				count=count+(k-(arr[i+1]+arr[i]));
				arr[i+1]+=k-(arr[i+1]+arr[i]);
				
			}
		}
		System.out.println(count);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}	
