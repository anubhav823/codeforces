import java.util.HashMap;
import java.util.Scanner;

public class Buns {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++) {
	int bun=sc.nextInt();
	int patties=sc.nextInt();
	int cutlets=sc.nextInt();
	int hamb=sc.nextInt();
	int cut=sc.nextInt();
	int maxItem=0;
	int minItem=0;
	int max=0;
	int min=0;
	if(cut>hamb)
		{
			maxItem=cutlets;
			max=cut;
			minItem=patties;
			min=hamb;
		}
	else
	{
		maxItem=patties;
		min=cut;
		minItem=cutlets;
		max=hamb;
	}
	int profit=0;
	if(bun>=2)
	{
		bun/=2;
		if(bun>=(patties+cutlets))
			profit=hamb*patties+cut*cutlets;
		else if(bun<(patties+cutlets))
		{
			if(bun>=maxItem)
			{
				profit=(maxItem*max);
				bun=bun-maxItem;
				profit=profit+(Math.min(bun, minItem)*min);
			}
			else
			{
				profit=profit+(bun*max);
			}
			
		}
	}
	else
		profit=0;
	System.out.println(profit);
	
	}
}
}
