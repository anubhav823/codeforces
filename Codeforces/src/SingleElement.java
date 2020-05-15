import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SingleElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int val=singleNonDuplicate(arr);
	System.out.println(val);
}
static int singleNonDuplicate(int nums[])
{
	int val=0;
	HashMap<Integer, Integer> hm=new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		if(hm.containsKey(nums[i]))
		{
			val=hm.get(nums[i]);
			val++;
			hm.put(nums[i],val);
		}
		else
			hm.put(nums[i],1);
	}
	 for (Entry<Integer, Integer> entry : hm.entrySet()) {
	        if (entry.getValue().equals(1)) {
	            val=entry.getKey();
	        }
	    }
	
    return val;
}
}
