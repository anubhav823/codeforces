import java.util.ArrayList;
import java.util.Scanner;
public class Dances {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int b=sc.nextInt();
	ArrayList<Integer> arrb=new ArrayList(b);
	int count=0;
	for(int i=0;i<b;i++)
		arrb.add(sc.nextInt());
	int g=sc.nextInt();
	ArrayList<Integer> arrg=new ArrayList(g);
	for(int i=0;i<g;i++)
		arrg.add(sc.nextInt());
	for(int i=0;i<b;i++)
	{
		for(int j=0;j<g;j++)
		{
			if((arrb.get(i)+1)==arrg.get(j) || (arrb.get(i)-1)==arrg.get(j))
			{
				count++;
				arrb.remove(arrb.get(i));
				arrg.remove(arrg.get(j));
				b--;
				g--;
			}
		}
	}
	if(count==0)
	System.out.println(count);
	else
		System.out.println(count+1);
}
}
