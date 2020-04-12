	import java.util.Scanner;
	
	public class Bachman {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int arr[]=new int[n/2];
		boolean prime[]=sieveOfEratosthenes(n);
		if(n%2==0)
			{
			count=n/2;
			System.out.println(count);
			for(int i=0;i<count;i++)
				System.out.print("2 ");
			}
		else if(n%2!=0)
		{
			count=n/2;
			System.out.println(count);
			for(int i=0;i<count-1;i++)
				System.out.print("2 ");
			System.out.println("3");
		}
	}
	static boolean[] sieveOfEratosthenes(int n) 
	{ 
	    boolean prime[] = new boolean[n+1]; 
	    for(int i=0;i<n;i++) 
	        prime[i] = true; 
	      
	    for(int p = 2; p*p <=n; p++) 
	    { 
	        if(prime[p] == true) 
	        { 
	            for(int i = p*2; i <= n; i += p) 
	                prime[i] = false; 
	        } 
	    } 
	    
	    return prime;
	}
	}
