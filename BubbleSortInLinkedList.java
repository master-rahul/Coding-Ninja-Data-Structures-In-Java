
public class BubbleSortInLinkedList {
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) return head;
        int num = 1;
        LinkedListNode<Integer> temp = head;
        while(temp.next != null){
            num++;
            temp = temp.next;
        }
        return helper(head, num-1);
	}
    
    public static LinkedListNode<Integer> helper(LinkedListNode<Integer> head, int num){
        if(head == null || num == 0) return head;
        LinkedListNode<Integer> first = head, second = head.next;
        int c = 1;
        while(c <= num ){
            if(first.data > second.data) {
                int t = first.data;
                first.data = second.data;
                second.data = t;
            }
            c++;
            first = first.next;
            second = second.next;
        }
        return helper(head, num-1);
    }
}
