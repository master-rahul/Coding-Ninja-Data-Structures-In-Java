
public class DeleteEveryNNodes {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		if(head == null || M == 0) return null;
        if(N == 0) return head;
        int cM = 1, cN = 1;
        LinkedListNode<Integer> temp = head;
        while(temp != null){
            if(cM == M){
                cN = 1;
                LinkedListNode<Integer> temp1 = temp.next;
                while(cN < N) {
                    if(temp1.next == null){
                        temp.next = null;
                        return head;
                    }
                    cN ++;
                    temp1 = temp1.next;
                }
                temp.next = temp1.next;
                cM = 0;
            }
            cM++;
            temp = temp.next;
        }
        return head;
	}
}
