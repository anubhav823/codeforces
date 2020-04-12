/*I have referred to the following link for this question
https://www.geeksforgeeks.org/prime-factorization-using-sieve-olog-n-multiple-queries/
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector; 

class StrangeNumber
{
	static final long MAXN = 100000001; 
	
	// stores smallest prime factor for every number 
	static long spf[] = new long[(int)MAXN]; 
	static void sieve() 
	{ 
		spf[1] = 1; 
		for (int i=2; i<MAXN; i++) 
	
			// marking smallest prime factor for every 
			// number to be itself. 
			spf[i] = i; 
	
		// separately marking spf for every even 
		// number as 2 
		for (int i=4; i<MAXN; i+=2) 
			spf[i] = 2; 
	
		for (int i=3; i*i<MAXN; i++) 
		{ 
			// checking if i is prime 
			if (spf[i] == i) 
			{ 
				// marking SPF for all numbers divisible by i 
				for (int j=i*i; j<MAXN; j+=i) 
	
					// marking spf[j] if it is not 
					// previously marked 
					if (spf[j]==j) 
						spf[j] = i; 
			} 
		} 
	} 
	
	// A O(log n) function returning primefactorization 
	// by dividing by smallest prime factor at every step 
	static Vector<Long> getFactorization(long x) 
	{ 
		Vector<Long> ret = new Vector<>(); 
		while (x != 1) 
		{ 
			ret.add(spf[(int) x]); 
			x = x / spf[(int) x]; 
		} 
		return ret; 
	} 
	
	// Driver method 
	public static void main(String args[]) throws NumberFormatException, IOException 
	{ 
		sieve(); 
		BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
		String line1 = sc.readLine();
		String line2=sc.readLine();
		if (line2 == null) {
		   System.out.println("Empty input");
		   return;
		}
		int t= Integer.parseInt(line1);
		long X=0;
		long k=0;
		for(int a=0;a<t;a++) {
			String[] LR= sc.readLine().split(" ");
			X=Integer.parseInt(LR[0]);
			k=Integer.parseInt(LR[1]);
			Vector <Long> p = getFactorization(X);
			if(p.size()>=k)
				System.out.println(1);
			else if(p.size()<k)
				System.out.println(0);
		} 
	} 
}

