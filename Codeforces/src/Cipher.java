import java.util.Scanner;

public class Cipher {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String a=sc.next();
	StringBuilder sb1=new StringBuilder();
	sb1.append(a);
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<n;i++)
	{
		sb.append(sb1.charAt(0));
		sb1.replace(0,i+1,"");
	}
	System.out.println(sb.toString());
}

}

