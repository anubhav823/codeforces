import java.util.Scanner;

public final class Joystick {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ans=0;
		int min=Math.min(n, m);
		int max=Math.max(n, m);
		for(int i=0;i<Math.max(n, m)*2;i++) {
			if(Math.min(min,max)<=0)
				break;
			else
			{
				min=Math.min(min,max);
				max=Math.max(min,max);
				min++;
				System.out.println("min "+min);
				max-=2;
				System.out.println("max "+max);
				ans++;
				System.out.println("ans "+ans);
				System.out.println();
			}
		}
		System.out.println(ans+1);
	}
}
