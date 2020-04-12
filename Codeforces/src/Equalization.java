import java.util.Arrays;
import java.util.Scanner;

public class Equalization {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int q=sc.nextInt();
	for(int a=0;a<q;a++)
	{
		int n=sc.nextInt();
		int arr[]=new int[n];
		double sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		double avg=Math.ceil(sum/n);
		while(avg*n>sum)
			{
			avg--;
			if(avg*n<=sum)
				{
				avg++;
				break;
				}
			}
		System.out.println((int)avg);
		
	}
}
}
