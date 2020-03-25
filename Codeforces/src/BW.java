import java.util.Scanner;

public class BW {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int flag=0;
	String a="";
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			a=sc.next();
			if(!(a.equals("B"))&&(!(a.equals("W")))&&(!a.equals("G")))
				flag++;
		}
	}
	if(flag>0)
		System.out.println("#Color");
	else
		System.out.println("#Black&White");
}
}
