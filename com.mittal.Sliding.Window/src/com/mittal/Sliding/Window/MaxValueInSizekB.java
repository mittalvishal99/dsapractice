package com.mittal.Sliding.Window;

public class MaxValueInSizekB {
	 static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) 
	    {
	        ArrayList<Integer>arr2=new ArrayList<>();
	        Deque<Integer>q=new ArrayDeque<>();
	        
	        int j=0;
	        int i=0;
	        while(j<n)
	        {
	            if(q.isEmpty()==true)
	            {
	                q.offer(arr[j]);
	            }
	            else if(q.getLast()<arr[j])
	            {
	                while(q.isEmpty()==false && q.getLast()<arr[j])
	                {
	                q.removeLast();
	                }
	                q.offer(arr[j]);
	            }
	            else{
	                q.offer(arr[j]);

	            }
	            
	            if((j-i+1)<k){
	                j++;    
	            }
	            else
	            {
	                if((j-i+1)==k)
	                {
	                    arr2.add(q.peek());
	                }
	                if(arr[i]==q.peek())
	                {
	                    q.poll();
	                    i++;
	                    j++;
	                }else{
	                    i++;
	                    j++;
	                }
	                
	            }
	        }
	        return arr2;
	   

}
