import java.util.Scanner;

public class UdayLand {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int pos=-1;
	int pos1=-1;
	String arr[]=new String[n];
	for(int j=0;j<n;j++)
		{
			arr[j]=sc.next();
		}
	for(int i=0;i<n;i++)
	{
		if(arr[i].charAt(0)=='O' && arr[i].charAt(1)=='O') {
			pos=i;
			pos1=0;
		}
		else if(arr[i].charAt(3)=='O' && arr[i].charAt(4)=='O')
		{
			pos=i;
			pos1=3;
		}
			
	}
	if(pos==-1)
	{
		System.out.println("NO");
	}
	else {
		System.out.println("YES");
		for(int i=0;i<n;i++)
		{
			if(i==pos)
			{
				if(pos1==0)
					System.out.println("++"+""+arr[i].charAt(2)+""+arr[i].charAt(3)+""+arr[i].charAt(4));
				else if(pos1==3)
					System.out.println(arr[i].charAt(0)+""+arr[i].charAt(1)+""+arr[i].charAt(2)+""+"++");
			}
			else
				System.out.println(arr[i]);
		}
	}
}
}
