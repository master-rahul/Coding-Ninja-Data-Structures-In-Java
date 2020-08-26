
public class LengthOfLL {
	public static int length(LinkedListNode<Integer> head){
		if(head == null) return 0;
		else{
            int c = 0;
            LinkedListNode<Integer> temp = head;
            while(temp !=  null){
                c++;
                temp = temp.next;
            }
            return c;
        }
    }
}
