import java.util.Scanner;

import com.sun.corba.se.spi.ior.iiop.AlternateIIOPAddressComponent;

public class Worms{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int piles[]=new int[n+1];
		piles[0]=0;
		piles[1]=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			int a=sc.nextInt();
			piles[i]=piles[i-1]+a;
		}
			
		int m=sc.nextInt();
		int alloc[]=new int[m];
		for(int i=0;i<m;i++)
		{
			alloc[i]=sc.nextInt();
			alteredBinarySearch(piles,alloc[i],0,n);

		}
		}
static void alteredBinarySearch(int arr[],int a,int low, int high)
{
	int mid=(low+high)/2;
	if(low<=high)
	{
		if(a>arr[mid] && a<=arr[mid+1])
			System.out.println(mid+1);
		else if(a<=arr[mid])
		{
			high=mid-1;
			alteredBinarySearch(arr, a, low, high);
		}
		else if(a>arr[mid+1])
		{
			low=mid+1;
			alteredBinarySearch(arr, a, low, high);
		}
	}
}
		
	
}