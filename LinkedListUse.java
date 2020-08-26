import java.util.Scanner;
public class LinkedListUse {

	public static void print(Node<Integer> head) {
		Node<Integer> ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data+" "+ptr+" ==>> ");
			ptr = ptr.next;
		}
		System.out.println("null");
	}
	
	public static void print1(Node<Integer> head){
	    Node<Integer> temp = head;

	    while(temp != null){
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	}

	public static void increment(Node<Integer> head){
	    Node<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
	
		Node<Integer> newNode = new Node<>(data);
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}
		else{
			int i = 0;
			Node<Integer> temp = head;
			while(temp != null) {
				temp = temp.next;
				i++;
				if( i == pos-1) {
					newNode.next = temp.next;
					temp.next = newNode;
				}
			}
			return head;
		
		}
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = head;
			}
			else {
				tail.next = newNode;
				tail = tail.next; // tail = newNode
			}
			data = s.nextInt();
		}
		System.out.println();
		s.close();
		return head;
	}

	public static void main(String[] args) {
		
//		Node<Integer> node1 = new Node<>(5);
//		System.out.println(node1.data);
//		System.out.println(node1.next);
//		Node<Integer> node2 = new Node<>(10);
//		node1.next = node2;
//		System.out.println(node2);
//		System.out.println(node1.next);
//		System.out.println(node1.next.data);
//		Node<Integer> head = node1;
		
//		Node<Integer> node1 = new Node<>(10);
//		Node<Integer> node2 = new Node<>(20);
//		Node<Integer> node3 = new Node<>(30);
//		node1.next = node2;
//		node1.next.next = node3;
//		Node<Integer> head = node1; //reference
//		print(head);
//		print(head);
		
//		Node<Integer> node1 = new Node<Integer>(10);
//	    Node<Integer> node2 = new Node<Integer>(20);
//	    node1.next = node2;
//	    //System.out.println(node2.next);
//	    increment(node1);
//	    print1(node1);
		Node<Integer> head = takeInput();
		head = insert(head,50,3);
		print(head);
	}
}
