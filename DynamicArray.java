package dynamic_array;

public class DynamicArray {
	private int array[];
	private int index;
	public DynamicArray() {
		array = new int[1];
		index = 0;
	}
	
	public void size() {
		System.out.println(array.length);
	}
	
	public void add(int element) {
		if(index == array.length) {
			resturcture();
		}
		array[index] = element;
		index++;
	}
	
	private void resturcture() {
		int temp[] = array;
		array = new int [array.length +1];
		for(int i = 0; i < temp.length; i++)
			array[i] = temp[i];
	}
	
	public void set(int index, int element) {
		if(index > this.index)
			return;
		else if(index < this.index)
			array[index] = element;
		else
			add(element);
	}
	
	public int getIndex(int index) {
		if(index >= this.index)
			return -1;
		return array[index];
	}
	
	public void isEmpty() {
		if(array.length== 0)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public void removeLast() {
		int array1[] = new int[array.length -1];
		index--;
		for(int i =0; i < index; i++)
			array1[i] = array[i];
		array = array1;
	}
	public void print() {
		for(int i =0; i<index; i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
}
