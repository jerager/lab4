
public class UseQueue {

	
public static void main(String[] args) {
		
		CS112QueueB myQ = new CS112QueueB();
		
		myQ.enqueue(1);
		myQ.writeArray();

		myQ.enqueue(2);
		myQ.writeArray();

		myQ.enqueue(7);
		myQ.writeArray();

		myQ.enqueue(18);
		myQ.writeArray();
		myQ.dequeue();
		myQ.writeArray();
		// this will throw an exception until you fix the Queue implementation
		myQ.enqueue(9);
		myQ.writeArray();

	}


}
