package Queue;

public class Queue {
	
	private int[] data;
	final private int front = 0;
	private int rear;
	
	public Queue() {
		data = new int[5];
		rear = 0;
	}
	
	public Queue(int capacity) {
		data = new int[capacity];
		rear = 0;
	}
	
	public void enqueue(int value) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		data[rear] = value;
		rear++;
	}
	
	public void dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		for(int i = 0; i < rear - 1; i++) {
			data[i] = data[i+1];
		}
		rear--;
		
	}
	
	public int size() {
		return rear;
	}
	
	public boolean isFull() {
		return rear == data.length;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int getFront() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return data[front];
	}
	
	public void display() {
		for(int i = front; i < rear ; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
