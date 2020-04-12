import java.util.Scanner;

public class Flipping {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int maxlength=0;
	int length=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		if(arr[i]==0)
			{
			length++;
			maxlength=Math.max(maxlength, length);
			}
		else
			length=0;	
			
	}
	if(arr.length==1 && arr[0]==1)
		System.out.println("0");
	else if(arr.length==1 && arr[0]==0)
		System.out.println("1");
	else
		System.out.println(maxlength+2);
}
}
