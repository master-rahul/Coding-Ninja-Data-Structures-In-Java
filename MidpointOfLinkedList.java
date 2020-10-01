
public class MidpointOfLinkedList {
	public static int printMiddel(LinkedListNode<Integer> head) {
        if(head == null) return -1;
        if(head.next == null || head.next.next == null) return head.data;
        LinkedListNode<Integer> fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast != null) slow = slow.next;
        }
        return slow.data;
    }
}
