import java.util.ArrayList;
import java.util.Scanner;

public class Carsds {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	ArrayList<Integer> dp=new ArrayList<>(100);
	dp.add(0,0);
	dp.add(1,2);
	for(int i=2;i<dp.size();i++)
		dp.add(i,2*dp.get(i-1)-dp.get(i-2)+3);
	
	for(int i=0;i<t;i++)
	{
		int n=sc.nextInt();
		int val=0;
		if(dp.contains(n))
			val=1;
		else 
		{
		for(int j=0;j<dp.size();j++)
		{
			if(n>=dp.get(j))
			{
				val++;
				n-=dp.get(j);
			}
			else
				break;
		}
		}
		System.out.println(dp);
		System.out.println(val);
	}
}
}
