import java.util.Scanner;

public class Buttons {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long sum;
	if(n<=2)
		sum=0;
	else {
		sum=1;
	}
	for(int i=1;i<=n;i++)
			sum+=i;
	System.out.println(sum);
	}
		
}
