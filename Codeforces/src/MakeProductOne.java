import java.util.Arrays;
import java.util.Scanner;

public class MakeProductOne {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextInt();
	long arr[]=new long[(int)n];
	long zeroCount=0;
	long sum=0;
	long negCount=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		if(arr[i]==0)
			zeroCount++;
		else if(arr[i]>0)
		{
			sum=sum+arr[i]-1;
		}
		else if(arr[i]<0)
		{
			negCount++;
			sum=sum+Math.abs(arr[i]+1);
		}
			
	}
	if(negCount % 2==1)
    {
        // make a zero -1
        if(zeroCount>0)
            {
        	sum++;
        	zeroCount--;
            }
        	
        	else
            sum += 2;
    }
 
    sum+= zeroCount;
    System.out.println(sum);
}
}
	