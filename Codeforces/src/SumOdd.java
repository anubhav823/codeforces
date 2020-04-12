import java.util.Scanner;

public class SumOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int a=0;a<t;a++)
	{
		long n=sc.nextLong();
		long k=sc.nextLong();
		if(n<k*k)
			System.out.println("NO");
		else if(n%2!=k%2)
			System.out.println("NO");
		else
			System.out.println("YES");
}
}
}
