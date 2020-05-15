import java.util.Scanner;

public final class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			long a=sc.nextLong();
			if(a<=2)
				System.out.println("0");
			else if(a%2!=0)
				System.out.println(a/2);
			else
				System.out.println((a/2)-1);
		}
	}

}
