
/*best as does not affect the structure
O(n) time
O(n) space
static boolean isLoop(Node head) 
{   HashSet<Node> s=new HashSet<Node>(); 
    for(Node curr=head;curr!=null;curr=curr.next) {  
        if (s.contains(curr)) 
            return true; 
        s.add(curr); 
    } 
    return false; 
*/