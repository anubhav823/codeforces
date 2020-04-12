import java.util.Scanner;

public class InitialBet {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0;
	int sum=0;
	for(int i=0;i<5;i++)
	{
		a=sc.nextInt();
		sum+=a;
	}
	if(sum>0 && sum%5==0)
		System.out.println(sum/5);
	else
		System.out.println(-1);
}
}
