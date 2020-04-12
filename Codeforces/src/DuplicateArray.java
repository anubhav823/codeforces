import java.util.Scanner;

public class DuplicateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int flag=0;
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
			if(a[0]==b[0]) {
			for(int i=1;i<n;i++)
			{
				if(a[i]<b[i] && a[i-1]>0)
					flag=1;
				else if(a[i]==b[i])
					flag=1;
				else
					flag=0;
			}
			}
			else {
			if(flag==1)
				System.out.println("YES");
			else if(flag==0)
				System.out.println("NO");
		}
		}
			
	}
}
