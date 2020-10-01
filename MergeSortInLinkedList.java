
public class MergeSortInLinkedList {
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) return head;
        LinkedListNode<Integer> mid = findMid(head);
        LinkedListNode<Integer> midNext = mid.next;
        mid.next = null;
        LinkedListNode<Integer> n1 = mergeSort(head);
        LinkedListNode<Integer> n2 = mergeSort(midNext);
		LinkedListNode<Integer> newHead = merger(n1,n2);
        return newHead;
    }
    static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head){
        if(head == null || head.next == null) return head;
        LinkedListNode<Integer> slow = head, fast = head;
    	while(fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast != null) slow = slow.next;
        }
        return slow;
    }
    static LinkedListNode<Integer> merger(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        LinkedListNode<Integer> head = null, tail = null;
        if(head1.data < head2.data) {
        	head = head1;
            tail = head1;
            head1 = head1.next;
        }
        else{ 
            head = head2;
            tail = head2;
            head2 = head2.next;
        }
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            else{
             	tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        if(head1 != null) tail.next = head1;
        else tail.next = head2;
        
        return head;
    }
}
