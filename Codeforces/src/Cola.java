import java.util.Arrays;
import java.util.Scanner;

public class Cola {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x[]=new int[n];
	int pos=0;
	for(int i=0;i<n;i++)
		x[i]=sc.nextInt();
	Arrays.sort(x);
	int q=sc.nextInt();
	for(int i=0;i<q;i++)
	{
		int a=sc.nextInt();
		pos=jumpSearch(x,a);
		System.out.println(pos+1);
		pos=0;
	}
	
	}


public static int jumpSearch(int[] arr, int x) 
{ 
    int n = arr.length; 

    // Finding block size to be jumped 
    int step = (int)Math.floor(Math.sqrt(n)); 

    int prev = 0; 
    while (arr[Math.min(step, n)-1] < x) 
    { 
        prev = step; 
        step += (int)Math.floor(Math.sqrt(n)); 
        if (prev >= n) 
            return 0; 
    } 

    while (arr[prev] < x) 
    { 
        prev++; 

        if (prev == Math.min(step, n)) 
            return -1; 
    } 

    // If element is found 
    if (arr[prev] == x) 
        return prev; 

    return -1; 
} 
}