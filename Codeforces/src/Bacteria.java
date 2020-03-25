	import java.util.Scanner;
	
	public class Bacteria {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		int a=1;
		for(int i=0;i<=n/1.5;i++)
		{
			if(Math.pow(2, i)==n)
				a=1;
			else if(Math.pow(2, i)>n)
				{
					a+=(int) (n-Math.pow(2, i-1));
					break;
				}
		}
		System.out.println(a);
		
	}
	}
