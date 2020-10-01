
public class ReverseLinkedListRecursive {
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
     	if(head == null || head.next == null) return head;
        LinkedListNode<Integer> tail = head.next, finalHead = reverse_R(head.next);
        tail.next = head;
        head.next = null;
        return finalHead;
	}
}
