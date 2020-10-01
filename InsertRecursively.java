import java.util.Scanner;

class Node<T>{
	Node( T data){
		this.data = data;
		this.next = null;
	}
	T data;
	Node<T> next;
}

public class InsertRecursively {
	static Node<Integer> takeInput(){
		Node<Integer> head = null, temp = null;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num != -1) {
			Node<Integer> newNode = new Node<>(num);
			if(head == null) temp = head = newNode;
			else temp = temp.next = newNode;
			num = s.nextInt();
		}
		s.close();
		return head;
	}
	
	static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" --> ");
			head = head.next;
		}
		System.out.println("NULL");
	}
	static Node<Integer> reverse_R(Node<Integer> head) {
     	if(head == null || head.next == null) return head;
     	Node<Integer> tail = head.next, finalHead = reverse_R(head.next);
     	tail.next = head;
     	head.next = null;
     	return finalHead;
       
	}
	static Node<Integer> insert(Node<Integer> head, int pos, int value) {
		
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(value);
			newNode.next = head;
			return newNode;
		}
		
		if(head == null) return null;
		
		head.next = insert(head.next, pos -1, value);
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		head = insert(head, 0-1, 10);
		print(head);
		head = reverse_R(head);
		print(head);
	}

}
