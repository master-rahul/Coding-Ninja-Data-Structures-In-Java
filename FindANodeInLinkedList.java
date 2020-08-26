
public class FindANodeInLinkedList {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		int count = 0;
        while(head != null){
            if(head.data == n)
                return count;
            count++;
        	head = head.next;
        }
    	return -1;
    }
}
