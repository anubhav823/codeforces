import java.util.Arrays;
import java.util.Scanner;

public class EqualCoins {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int arr[]=new int[3];
		for(int j=0;j<3;j++)
			arr[j]=sc.nextInt();
		Arrays.sort(arr);
		int n=sc.nextInt();
		int res=(arr[2]-arr[0])+(arr[2]-arr[1]);
		if((n-res)%3==0 && (n-res)>=0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
			}
}
