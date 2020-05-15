import java.util.Scanner;

public final class MakeOne {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long arr[]=new long[n];
	long negcount=0;
	long poscount=0;
	long count=0;
	long zerocount=0;
	long parity=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextLong();
		if(arr[i]<0)
			parity++;
		if(arr[i]==0)
			zerocount++;
	}
	if(parity%2==0)
	{
		for(int i=0;i<n;i++) {
		if(arr[i]<0)
			negcount=negcount+arr[i]+1;
		else if(arr[i]==0)
			count++;
		else if(arr[i]>0)
			poscount=poscount+arr[i]-1;
	}
	}
	else
	{
		if(zerocount%2==0 )
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
				count++;
			else
				count=count+Math.abs(arr[i]-1);
			
		}
	}
	
	count+=Math.abs(negcount)+Math.abs(poscount);
	System.out.println(Math.abs(count));
	
}
}
