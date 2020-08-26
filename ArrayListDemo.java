import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println(list1.size()); 
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1.size());
		
		list1.add(0,40);
		System.out.println(list1.get(1));
		
		for(int i =0; i< list1.size(); i++)
			System.out.print(list1.get(i)+" ");
		System.out.println();
		
		list1.remove(1);
		for(int i =0; i< list1.size(); i++)
			System.out.print(list1.get(i)+" ");
		System.out.println();
		
		list1.set(2,90);
		for(int element : list1)
			System.out.print(element +" ");
	} 

}
