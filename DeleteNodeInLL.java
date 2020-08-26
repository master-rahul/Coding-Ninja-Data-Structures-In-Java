
public class DeleteNodeInLL {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		if(pos == 0){
            head = head.next;
            return head;
        }
        else{
            int i = 0;
            LinkedListNode<Integer> temp = head;
            while(temp != null){
                if(i == pos-1){
                    if(temp.next != null){
                        temp.next = temp.next.next;
                    }
                }
                i++;
                temp= temp.next;
            }
            return head;
        }
	}
}
