import java.util.Scanner;

public class Time {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int h=sc.nextInt();
		int m=sc.nextInt();
		h=23-h;
		m=60-m;
		System.out.println((h*60)+m);
	}
}
}
