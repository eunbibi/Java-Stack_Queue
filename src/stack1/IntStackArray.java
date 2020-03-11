package stack1;

///Creating a Stack using arrays

public class IntStackArray {
	private int[] stack;
	private int size;
	private static final int INITIAL_SIZE = 10;

	public IntStackArray() {
		stack = new int[INITIAL_SIZE];
		size = 0;
	}

	public void push(int value) {
		if (size == stack.length) {
			doubleCapacity();
		}
		stack[size] = value;
		size++;
	}

	public int pop() {
		if (size == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int result = stack[size - 1];
		stack[size - 1] = 0;
		size--;
		return result;
	}

	public int peek() {
		if (size == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int result = stack[size - 1];
		return result;
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return stack.length;
	}

	public int capacityRemaining() {
		int result = stack.length - size;
		return result;
	}

	public void empty() {
		for (int i = 0; i < stack.length; i++) {
			stack[i] = 0;
		}
		size = 0;
	}

	public void compress() {
		if (size < stack.length) {
			int newCapacity = size;
			int[] newStack = new int[newCapacity];
			for (int i = 0; i < stack.length; i++) {
				newStack[i] = stack[i];
			}
			stack = newStack;
		}
	}

	private void doubleCapacity() {
		int newCapacity = 2 * stack.length;
		int[] newStack = new int[newCapacity];
		for (int i = 0; i < stack.length; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		IntStackArray stack = new IntStackArray();
		stack.push(1002);
		stack.push(1003);
		stack.push(1004);
		stack.push(1005);
		System.out.println("Pop Stack: " + stack.pop());
	}
}
