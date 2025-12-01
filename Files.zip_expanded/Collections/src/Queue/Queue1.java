package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
public static void main(String[] args) {
	Queue q=new PriorityQueue();
	q.add(100);
	q.add(200);
	q.add(1000);
	q.add(40);
	q.add(5);
	q.add(1);
	System.out.println(q);
}
}
