import java.util.Scanner;

public class Divisibility {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		long a=sc.nextLong();
		long b=sc.nextLong();
		if(a%b==0)
			System.out.println('0');
		else
			System.out.println(b-(a%b));
	}
}
}
