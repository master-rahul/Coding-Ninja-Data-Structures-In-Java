
public class DeleteNode {
public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	
		if(head == null) return head;
		if(pos == 0) return head.next;
		head.next = deleteNodeRec(head.next, pos-1);
		return head;
	}

}
