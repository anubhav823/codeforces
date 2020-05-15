import java.util.Arrays;
import java.util.Scanner;

public class Tetris {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int flag=1;
		int n=sc.nextInt();
		if(n==1)
			flag=0;
		else {
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
			arr[j]=sc.nextInt();
		Arrays.sort(arr);
		for(int j=0;j<n-1;j++)
		{
			if((arr[n-1]-arr[j])%2==0)
				flag=0;
			else if(arr[j]==arr[n-1])
				flag=0;
			else if(n==1)
				flag=0;
			else
				flag=1;
		}
		}
		if(flag==1)
		System.out.println("NO");
		else
			System.out.println("YES");
	}
	
}
}
