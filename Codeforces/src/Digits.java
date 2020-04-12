import java.util.Scanner;

public class Digits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int k2=sc.nextInt();
	int k3=sc.nextInt();
	int k5=sc.nextInt();
	int k6=sc.nextInt();
	int min=9999;
	int sum=0;
	if(k2>0 && k5>0 && k6>0)
	{
		min=Math.min(k2, k5);
		min=Math.min(min,k6);
	
	for(int i=0;i<min;i++)
	{
		sum+=256;
		k2--;
	}
	}
	if(k2>0 && k3>0)
	{
		min=Math.min(k2, k3);
		for(int i=0;i<min;i++)
		{
			sum+=32;
		}
	}
	
	System.out.println(sum);
}
}
