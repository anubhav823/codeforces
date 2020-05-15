import java.util.Scanner;

public final class KillShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int flag=0;
			int x=sc.nextInt();
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(x>10) {
			for(int j=0;j<n;j++)
			{
				x=(int) (Math.floor(x/2)+10);
				if(x<=0)
				{
					flag=1;
					break;
				}
			}
			for(int j=0;j<m;j++)
			{
				x=x-10;
				if(x<=0)
				{
					flag=1;
					break;
				}
			}
			}
			else if(x<=10)
			{
				if(m>0)
					flag=1;
			}
			if(flag==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		}
		

}
