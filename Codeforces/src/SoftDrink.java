import java.util.Scanner;

public class SoftDrink {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int l=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int p=sc.nextInt();
	int nl=sc.nextInt();
	int np=sc.nextInt();
	int kl=k*l;
	int cd=c*d;
	int first=kl/nl;
	int second=cd;
	int third=p/np;
	int min=Math.min(first, second);
	min=Math.min(min, third);
	System.out.println(min/n);
}
}
