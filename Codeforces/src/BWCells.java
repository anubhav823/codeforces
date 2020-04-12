import java.util.Scanner;

public class BWCells {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int a=0;a<t;a++)
	{
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n%2==0 || m%2==0)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(j%2==0) {
					if(j==m-1)
						System.out.print("B");
					else
						{
							System.out.print("B");
							System.out.print("W");
						}
					System.out.println();
					}
					else
					{
						
					}
				}
			}
		}
	}
}
}
