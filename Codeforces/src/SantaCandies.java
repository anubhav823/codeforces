import java.util.ArrayList;
import java.util.Scanner;

public class SantaCandies {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=0;
	if(n==1 || n==2)
	{
		System.out.println(1);
		System.out.println(n);
	}
	else {
	ArrayList<Integer> arr=new ArrayList<>(n);
	for(int i=1;i<n;i++)
	{
		if(!arr.contains(i))
			{
			if((n-i)>i)
				{
				arr.add(i);
				n-=i;
				k++;
			}
			
			}
		
	}
	arr.add(n);
	k++;
	System.out.println(k);
	for(int i=0;i<arr.size();i++)
		System.out.print(arr.get(i)+" ");
}
}
}
