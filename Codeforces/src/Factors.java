import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	long dp[]=new long[100000];
	ArrayList<Long> arr=new ArrayList<>(100000);
	arr=sieveOfEratosthenes(100000);
	for(int i=2;i<dp.length;i++)
	{
		if(i%2==0)
			dp[i]=2;
		else
		{
			if(arr.contains(i))
				dp[i]=i;
			else
				dp[i]=smallestFactor(i);
		}
		}
	for(int i=0;i<t;i++)
	{
		
		int n=sc.nextInt();
		long sum=n;
		int k=sc.nextInt();
		for(int j=0;j<k;j++)
		{
			sum=sum+dp[(int) sum];
		}
		System.out.println(sum);
	}
}
static long smallestFactor(int C)
{
    for (int i = 2; i*i<= C; i++) 
    {   
        if (C % i == 0)
        {
            return i;
        }
    }

    return C;
}
static ArrayList<Long> sieveOfEratosthenes(int n) 
{ 
    // Create a boolean array "prime[0..n]" and initialize 
    // all entries it as true. A value in prime[i] will 
    // finally be false if i is Not a prime, else true. 
    boolean prime[] = new boolean[n+1]; 
    for(int i=0;i<n;i++) 
        prime[i] = true; 
    ArrayList<Long> arr=new ArrayList<>(100000);  
    for(int p = 2; p*p <=n; p++) 
    { 
        // If prime[p] is not changed, then it is a prime 
        if(prime[p] == true) 
        { 
            // Update all multiples of p 
            for(int i = p*2; i <= n; i += p) 
                prime[i] = false; 
        } 
    } 
      
    // Print all prime numbers 
    for(int i = 2; i <= n; i++) 
    { 
        if(prime[i] == true) 
            arr.add((long) i);
    }
    return arr;
}
}
