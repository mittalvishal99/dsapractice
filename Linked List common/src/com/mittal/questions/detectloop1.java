package com.mittal.questions;
/*       get the gist of code for more naive approach
     we are going to different node with current
     
      and then checking all the previous nodes from begining
  10-->20-->30-->40-->null
  case 1)-if curr==null after traversing then it means
  			no loops in LL
  
  
  10-->20-->30--40-
  		^------<--|
  		
  		if(40.next==20)
  		then issue
  		
  		so when current is at 40
  		check all previous nodes with help of for loop starting from begin till current node
  		eg)curr is at 30
  		if(10.next==30.next)
  		it means not in loop
  		
  		then 20.next==30.next
  			no
  			
  			like this when curr is 40
  			10.next==40.next
  			means loop
  			yes
  			
  O(n^2)
  
  please change creatiion of LL in main funtion 
  do one by one input
  
*/
/*
 * Please see second method....if u can change LL defination
 * then add a boolean variable of flag in node class
 * after every iteration make flag as false and check if flag is not already false
 * u got my point
 */
public class detectloop1 {
	public static boolean detect(Node head)
	{
		Node curr=head;
		int count=0;
		while(curr!=null)
		{
			Node link=curr;
			count++;
			Node temp=head;
			for(int i=1;i<count;i++)
			{
				if(temp.next==link.next)
				{
					System.out.println("yes loop");
					return true;
				}
				temp=temp.next;
			}
			curr=curr.next;
		}return false;
	}

}
