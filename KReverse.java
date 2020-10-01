
public class KReverse {
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		if(head == null || head.next == null || k == 0 || k == 1) return head;
        LinkedListNode<Integer> temp =  head, fHead = null;
        int c = k;
        while(c != 0) {	if(temp == null) break;
            c--;
            temp = temp.next;
        }
        fHead = reverse(head, k);
        if(temp == null) return fHead;
        LinkedListNode<Integer> temp1 = fHead;
        while(temp1.next != null)	temp1 = temp1.next;        	
        head.next = kReverse(temp,k);
        return fHead;
	}
    
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head, int k){
        if(head == null || head.next == null || k == 1) return head;
        LinkedListNode<Integer> tail = head.next, fHead = reverse(head.next, k-1);
        tail.next = head;
        head.next = null;
        return fHead;
    }
    
}
