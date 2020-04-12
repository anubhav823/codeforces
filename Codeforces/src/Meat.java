	import java.util.Arrays;
	import java.util.Scanner;
	
	public class Meat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int amount[]=new int[a];
		long ans=0;
		long finalprice=9999999;
		int price[]=new int[a];
		for(int i=0;i<a;i++)
		{
			amount[i]=sc.nextInt();
			price[i]=sc.nextInt();
		}
		double arr[]=new double[a];
		for(int i=1;i<=a;i++)
		{
			finalprice=Math.min(finalprice, price[i]);
			ans+=finalprice*amount[i];
		}
		System.out.println(ans);
	}
	}