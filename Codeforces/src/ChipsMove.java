import java.util.Scanner;

public final class ChipsMove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		long x[]=new long[n];
		for(int i=0;i<n;i++)
			x[i]=sc.nextLong();
		if(n%2==0)
			count=n/2;
		else if(n%2!=0)
			count=n/2+1;
		System.out.println(Math.min(count, n-count));
	}
	}