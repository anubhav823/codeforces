import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public final class SerejaSuffix
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		HashMap<Integer, Integer> set=new HashMap<>();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
			}
		int count[]=new int[n];
		for(int i=0;i<n;i++)
			count[i]=0;
		for(int i=0;i<n;i++)
		{
			if(set.get(arr[i])==0)
			{
				set.get(arr[i]);
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(count[i]
					);
		
	}
}