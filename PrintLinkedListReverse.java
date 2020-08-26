
public class PrintLinkedListReverse {
	public static void printReverse(LinkedListNode<Integer> root) {
        if(root == null) return;
        LinkedListNode<Integer>temp = root;
        helper(temp);
        System.out.print(root.data+" ");
	}
    
    static void helper(LinkedListNode<Integer> root){
        
        if(root.next == null){
            //System.out.print(root.data+" ");
            return;
        }
        helper(root=root.next);
        System.out.print(root.data+" ");

    }
}	
