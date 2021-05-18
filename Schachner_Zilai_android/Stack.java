package opr.ue01.aufgabe01;

public class Stack {
	private int[] stack;
	private int top, size;
	int xTestX;
	


	public void thisIsANewMethod() { 
		xTestX = xTestX * xTestX; 
		System.out.println("This is a new Method!");
		System.out.println("This fixes bug 1");
	}


	public void initStack (int size) {
		xTestX = 420;
		if (size <= 0) {
			size = 10;
			System.out.println("Stack size is to small and was set to 10! (minumum 1)");
		}
		this.size = size;
		top = 0;
		stack = new int[size];
	}
	
	public void clear() {
		for (int i = 0; i < size; i++) {
			stack[i] = 0;
		}
		top = 0;
	}
	
	public void push(int val) {
		if (top >= size) {
			top = 0;
		}
		stack[top] = val;
		top = top + 1;
	}

	public int pop() {
		if (top <= 0) {
			top = size;
		}
		top = top - 1;
		return stack[top];
	}
	
	public int peek() {
		return stack[top-1];
	}
	
	public int elements() {
		int x = 0;
		for (int i = 0; i < size; i++) {
			if (stack[i] != 0) {
				x++;
			}
		}
		return x;
	}
	
	public int size() {
		return size;
	}
	
	public void print() {
		System.out.print("stack: ");
		for (int i = 0; i < size; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(stack[i]);
		}
		System.out.println(".");
	}
}