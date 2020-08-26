
public class EliminateDuplicatesFromLL {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) return head;
        LinkedListNode<Integer> temp = head;
        while(temp.next != null){
           if(temp.data.equals(temp.next.data) && temp.next.next != null) {
               temp.next = temp.next.next;
           }
            else{
                if(temp.next.next == null && temp.data.equals(temp.next.data))
                    temp.next = null;
                else
                    temp = temp.next;
            }
        }
        return head;
	}
}
