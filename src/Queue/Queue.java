package Queue;
//Creating a Queue using Linked lists

class Queue {
	private static class Node {
		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public int peek() {
		return head.data;
	}

	public void add(int data) {
		Node node = new Node(data);
		if (tail != null) {
			tail.next = node;
		}
		tail = node;
		if (head == null) {
			head = node;
		}
	}

	public int remove() {
		int data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.add(1002);
		queue.add(1003);
		queue.add(1004);
		queue.add(1005);
		System.out.println("Dequeue Queue : " + queue.remove());
		System.out.println("Dequeue Queue : " + queue.remove());
		System.out.println("Peek Queue : " + queue.peek());
	}
}
