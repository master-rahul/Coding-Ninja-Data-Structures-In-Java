
public class PrintIthNode {
	public static void printIthNode(LinkedListNode<Integer> head, int i){
		int c = 0;
        while(head != null){
            if(i == c) {
                System.out.println(head.data);
                return;
            }
            else{
                c++;
                head = head.next;
            }
        }
	}
}
