import java.util.LinkedList;
import java.util.Queue;


// A QUEUE IS A FIFO data structure

/*
enqueing = adding to the end
de-queueing = remove from the head
 */

// Queue<String> queue = new Queue<String>();  // since queue is an interface,
// it can't be initiated, so
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue  = new LinkedList<String>(); // features linkedlist will utilize via queue interface
        //add = enqueue =                      .offer()
        //remove at head = dequeue =           .poll()
        //take a look at the head of queue,    .peek()
        // check if queue is empty,            .isEmpty()
        // see the no. of items in the queue,  .size()
        //see if specific obj                  .contains()

        //adding item to queue
        queue.offer("Karen");
        queue.offer("chad");
        queue.offer("Steve");
        queue.offer("tony");

        System.out.println(queue);
        System.out.println(queue.peek()); // queueing
        System.out.println(queue.poll()); // dequeuing

        System.out.println(queue); // checking the queue
        System.out.println(queue.isEmpty());




    }
}










