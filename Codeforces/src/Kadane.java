import java.util.Arrays;
import java.util.Scanner;

public class Kadane {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int val=KadaneCircular(arr);
	System.out.println(val);
}
public static int kadane(int[] A)
{
	int max_so_far = 0;

	int max_ending_here = 0;

	for (int i = 0; i < A.length; i++)
	{
		max_ending_here = max_ending_here + A[i];
		max_ending_here = Integer.max(max_ending_here, 0);
		max_so_far = Integer.max(max_so_far, max_ending_here);
	}
	return max_so_far;
}
public static int KadaneCircular(int[] A)
{
	for (int i = 0; i < A.length; i++) {
		A[i] = -A[i];
	}
	int negMaxSum = kadane(A);
	for (int i = 0; i < A.length; i++) {
		A[i] = -A[i];
	}
	return Integer.max(kadane(A), Arrays.stream(A).sum() + negMaxSum);
}

}
