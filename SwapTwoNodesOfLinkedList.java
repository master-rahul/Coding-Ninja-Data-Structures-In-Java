
public class SwapTwoNodesOfLinkedList {
	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		if(i == j) return head;
        if(i > j){	i = i + j;
            j = i - j;
            i = i - j;
        }
        LinkedListNode<Integer> firstNode = null, firstNodePrev = null, secondNode = null, secondNodePrev = null, current = head;
        int pos = -1;
        while(current != null){	pos++;
            if(pos == i -1){	firstNodePrev = current;
            	firstNode = current.next;
            }	if(pos == j -1){	secondNodePrev = current;
                secondNode = current.next;
                break;
            }
            current = current.next;
        }
        current = secondNode.next;
    	if(firstNodePrev == null){	firstNode = head;
            if(j - i == 1){	head.next = current;
            				head = secondNode;
                			head.next = firstNode;
            }	else{ head = secondNode;
                	secondNode.next = firstNode.next;
                	firstNode.next = current;
                	secondNodePrev.next = firstNode; 
             	}
         }
         else{ if(j - i == 1){ 	firstNodePrev.next = secondNode;
                	secondNode.next = firstNode;
    				firstNode.next = current;
               } else{	firstNodePrev.next = secondNode;
                	secondNode.next = firstNode.next;
                	secondNodePrev.next = firstNode;
                	firstNode.next = current;
             	 }   
         }
        return head;
	}
}
