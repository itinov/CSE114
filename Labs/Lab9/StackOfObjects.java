package Labs.Lab9;
/*  
 *  This lab actually is a simple implementation of a Stack, which is further
 *  used and taught in CSE 214
 */

public class StackOfObjects {
	
	private Object[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 2;
	
	public StackOfObjects() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfObjects(int capacity) {
		elements = new Object[capacity];
	}
	public void push(Object value) {
		if(size >= elements.length) {
			Object[] temp = new Object[elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	public Object pop() {
		return elements[--size];
	}
	public Object peek() {
		return elements[size-1];
	}
	public int getSize() {
		return size;
	}
	public void getElements() {
		for(int i=0;i<size;i++) {
			System.out.println(elements[i]);
		}
	}
	public boolean isEmpty() {
		if(size == 0) 
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		StackOfObjects stack = new StackOfObjects();
		System.out.println("Stack is initially empty: " + stack.isEmpty());
		System.out.println("Adding elements....");
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        stack.push("six");
        System.out.println("All the elements in the stack: ");
        stack.getElements();
		System.out.println("The element on top of the stack is: " + stack.peek());
        System.out.println("Is the stack empty: " + stack.isEmpty());
        stack.pop(); // remove top element
        System.out.println("Removed six.");
        System.out.println("The size of the stack is: " + stack.getSize());
        System.out.println("The element on top of the stack is: " + stack.peek());
        System.out.println("All the elements starting from top: ");
        while (!stack.isEmpty()) {
            String s = (String) stack.pop();
            System.out.print(s + ", ");
        }
    	System.out.println("\nIs the stack empty: " + stack.isEmpty());
        
    
	}
}
