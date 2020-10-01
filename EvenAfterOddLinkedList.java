
public class EvenAfterOddLinkedList {
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) return head;
        LinkedListNode<Integer> oddH = null, oddT = null, evenH = null, evenT = null, temp = head;
        while(temp != null){
            if(temp.data %2 == 1){
                if(oddH == null){
                    oddH = temp;
                    oddT = temp;
                }
                else{
                    oddT.next = temp;
                    oddT = oddT.next;
                }
            } else{
                if(evenH == null){
                    evenH = temp;
                    evenT = temp;
                }
                else{
                    evenT.next = temp;
                    evenT = evenT.next;
                }
            }
            temp = temp.next;
        }
        if(oddH == null) return evenH;
        if(evenH == null) return oddH;
        oddT.next = evenH;
        evenT.next = null;
        return oddH;
        
	}
}
