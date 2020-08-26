
public class PalindromeLinkedList {
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) return true;
        LinkedListNode<Integer> p = head, fp = head;
        while(fp != null){
            if(fp.next == null || fp.next.next == null) break;
            else{
                p = p.next;
                fp = fp.next.next;
            }
        }
        LinkedListNode<Integer> head1 = p.next, ptr = head1.next;
        fp = head1;
        head1 = ptr;
        ptr = head1.next;
        head1.next = fp;
        fp.next=null;
        while(ptr != null){
            fp = ptr;
            ptr = ptr.next;
            fp.next = head1;
            head1 = fp;
        }
        p = head1;
        fp = head;
      while(p!=null){
          if(fp.data == p.data);
          else return false;
          p = p.next;
          fp =fp.next;
      } 
        return true;
	}
}
