import java.util.*;
class Solution {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int trust[][]=new int[N][2];
		for(int i=0;i<N;i++)
		{
			trust[i][0]=sc.nextInt();
			trust[i][1]=sc.nextInt();
		}
		int val=findJudge(N,trust);
		System.out.println(val);
	}
    public static int findJudge(int N, int[][] trust) {
    	int count[]=new int[N+1];
    	for(int item[]:trust)
    	{
    		count[item[0]]--;
    		count[item[1]]++;
    	}
    	for(int i=0;i<N+1;i++)
    		System.out.println(count[i]);
    	for(int i=1;i<=N;i++)
    	{
    		if(count[i]==N-1)
    			return i;
    	}
    	return -1;        	
}
}