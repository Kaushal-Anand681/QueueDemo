package Queue;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.display();
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isFull());
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		System.out.println(queue.isEmpty());
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		System.out.println(queue.getFront());

	}

}
