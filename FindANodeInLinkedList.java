
public class FindANodeInLinkedList {
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
		if(head == null) return -1;
        if(head.data.equals(n)) return 0;
        int num = findNodeRec(head.next, n);
        if(num == -1) return -1;
        return 1 + num;
	}
}	
