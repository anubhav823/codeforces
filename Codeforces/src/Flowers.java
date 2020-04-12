import java.util.Arrays;
import java.util.Scanner;

public class Flowers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long countSmall=1;
	long countBig=1;
	long res=0;
	long res1=1;
	int flag=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	Arrays.sort(arr);
	for(int i=0;i<n-1;i++)
	{
		if(arr[i]!=arr[i+1])
		{
			flag=1;
			break;
		}
		else
		{}
	}
	if(flag==0)
	{
		res1=n*(n-1)/2;
		System.out.print("0");
		System.out.println(res1);
	}
	else {
	for(int i=1;i<n;i++)
	{
		if(arr[i]==arr[0])
			countSmall++;
	}
	for(int i=0;i<n-1;i++)
	{
		if(arr[i]==arr[n-1])
			countBig++;
	
	}
	System.out.print(arr[n-1]-arr[0]+" ");
	res=countBig*countSmall;
	System.out.println(res);
	}
	
}
	
}
