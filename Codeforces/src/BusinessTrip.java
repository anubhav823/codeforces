import java.util.*;

public class BusinessTrip {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	int sum=0;
	int arr[]=new int[12];
	for(int i=0;i<12;i++)
	{
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	Arrays.sort(arr);
	if(sum<a)
		System.out.println("-1");
	else{
		for(int i=11;i>=0;i--)
	
	{
		if(a>0) {
			if(arr[i]<=a)
			{
				a-=arr[i];
				count++;
			}
			else if(arr[i]>a)
			{
				a-=arr[i];
				count++;
				break;
			}
		}
		else if(a==0)
		{break;}
		
	}
		System.out.println(count);
	}
	
}
}