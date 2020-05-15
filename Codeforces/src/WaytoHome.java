import java.util.ArrayList;
import java.util.Scanner;

public class WaytoHome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=sc.nextInt();
	int flag=0;
	String s=sc.next();
	ArrayList<Integer> list=new ArrayList<>();
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='1')
			list.add(i);
	}
	for(int i=0;i<list.size()-1;i++)
	{
		if(list.get(i+1)-list.get(i)>d)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
		System.out.println(-1);
	else
	{
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=1;j<list.size();j++)
			{
				if(list.get(j)-list.get(i)<d)
					
			}
				
		}
	}
}
}
