import java.util.Scanner;

public class Kadane {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int val=maxSubarraySumCircular(arr);
	System.out.println(val);
}
	public static int maxSubarraySumCircular(int[] A) 
{
		int n=A.length;
		int maxglobal=A[0];
		int maxsum=A[0];
		for(int i=1;i<n;i++)
		{
			maxsum=Math.max(A[i], maxsum+A[i]);
			if(maxsum>maxglobal)
				maxglobal=maxsum;
			System.out.println(maxglobal);
		}
	return maxglobal;
}
}
