
public class ReverseLinkedListIterative {
	public static LinkedListNode <Integer> reverse_I(LinkedListNode<Integer> head) {
		LinkedListNode <Integer> prev = null, current = head, next = null;
        while(current != null){
			next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
	}
}
