	import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
	
	public class Laptops {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		int a,b;
		HashMap<Integer, Integer> hm=new HashMap<>(n);
		for(int i=0;i<n;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			hm.put(a,b);
		}
		 Map<Integer, Integer> map = new TreeMap<Integer, Integer>(hm);
		 System.out.println(map);
         for(int i=0;i<n-1;i++)
         {
        	 if(map.get(i)>map.get(i+1))
        	 {
        		 System.out.println(map.get(i));
        		 flag=1;
        		 break;
        	 }
         }
         if(flag==1)
			System.out.println("Happy Alex");
		else
			System.out.println("Poor Alex");
	}
	}