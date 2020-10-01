import java.util.LinkedList;
public class JavaCollectionFramework {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(); // Doubly By Default
		//System.out.println(list.size());
		list.add(10);
		list.add(20);
		list.addFirst(1);
		list.addLast(2);
		list.set(3, 100);
		System.out.println("Size Of list: "+ list.size());
		for(int i =0; i < list.size(); i++)
			System.out.print(list.get(i)+" <- -> ");
		Object array[] = list.toArray();
		System.out.println("\n"+array[0]+" "+array[1]);
		Integer a[] = new Integer[list.size()]; 
		a = list.toArray(a);
		System.out.println(a[0]+" "+a[1]);

	}

}
