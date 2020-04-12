import java.util.HashMap;
import java.util.Scanner;

class Frequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=0;
        int arr[];
        try {
        if(sc.hasNext())
        	t=sc.nextInt();
        for(int i=0;i<t;i++)
        {	
        	HashMap<Character,Integer> hm1=new HashMap<>();
            HashMap<Character,Integer> hm2=new HashMap<>();
            String s=sc.next();
        	int mid=0;
			if(s.length()%2==0)
			{
				mid=s.length()/2;
				String a=s.substring(0,mid);
				for (char c : a.toCharArray()) { 
		            if (hm1.containsKey(c)) { 
		            	hm1.put(c, hm1.get(c) + 1); 
		            } 
		            else { 
		            	hm1.put(c, 1); 
		            }
		            }
				a=s.substring(mid,s.length());
				for (char c : a.toCharArray()) { 
		            if (hm2.containsKey(c)) { 
		            	hm2.put(c, hm1.get(c) + 1); 
		            } 
		            else { 
		            	hm2.put(c, 1); 
		            	}
		            
		        }
				if(hm1.equals(hm2))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
			{
				HashMap<Character,Integer> hm3=new HashMap<>();
		        HashMap<Character,Integer> hm4=new HashMap<>();
		        
				mid=s.length()/2;
				String a=s.substring(0,mid);
				for (char c : a.toCharArray()) { 
		            if (hm3.containsKey(c)) { 
		            	hm3.put(c, hm3.get(c) + 1); 
		            } 
		            else { 
		            	hm3.put(c, 1); 
		            } 
		        }
				a=s.substring(mid+1,s.length());
				for (char c : a.toCharArray()) { 
		            if (hm4.containsKey(c)) { 
		            	hm4.put(c, hm4.get(c) + 1); 
		            } 
		            else { 
		            	hm4.put(c, 1); 
		            } 
		        }
				if(hm3.equals(hm4))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
        }
        }
        catch(Exception e)
        {}
        }
        }
