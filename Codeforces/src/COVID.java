import java.util.Scanner;

public class COVID {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try
	{
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int flag=0;
			int N=sc.nextInt();
			short arr[]=new short[N];
			String s="";
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<N;j++)
			{
				arr[j]=sc.nextShort();
				sb.append(arr[j]);
			}
			s=sb.toString();
			if(s.contains("100001")|| s.contains("10001")||s.contains("1001")||s.contains("101")||s.contains("11"))
				System.out.println("NO");
			else
				System.out.println("YES");
			
		}
	}
		catch(Exception e)
	{}
}
}
