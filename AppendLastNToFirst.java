
public class AppendLastNToFirst {
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		int size = 0;
        LinkedListNode<Integer> temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int pos = size - n, count = 0;
        if(head == null) return head;
        while(temp.next != null){
            if(count == pos -1){
                LinkedListNode<Integer> head1 = temp.next;
                LinkedListNode<Integer> temp1 = temp.next;
                temp.next = null;
                while(temp1.next != null){
                    temp1 =temp1.next;
                }
                temp1.next = head;
                head = head1;
                return head;
            }
            else{
                temp =temp.next;
                count++;
            }
        }
        
//         while(temp.next != null){
//             if(count >= pos-1){
//                 LinkedListNode<Integer> temp1 = temp;
//                 temp1 = temp1.next;
//                 if(temp1.next == null){
//                     temp.next = null;
//                 	temp1.next= head;
//                 	head = temp1;
//                 }
//                 else{
//                     temp.next = temp1.next;
//                     temp1.next = head;
//                     head = temp1; 
//                 }        
//             	}
//              else{
//                 temp = temp.next;
//                 count++;
//             }
//       }
      
        
        return head;
	}
}
