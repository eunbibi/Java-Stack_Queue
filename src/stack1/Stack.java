package stack1;
//Creating a Stack using Linked lists

class Stack {
	private static class Node {
		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
		}
	}

	private Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {
		return top.data;
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}

	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Stack stack = new Stack();
		stack.push(1002);
		stack.push(1003);
		stack.push(1004);
		stack.push(1005);
		System.out.println("Pop Stack : " + stack.pop());
	}
}
