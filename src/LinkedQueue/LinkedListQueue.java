package LinkedQueue;



public class LinkedListQueue {
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
