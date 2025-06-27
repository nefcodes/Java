import java.util.*;


 public class Main {

     public static void main(String[] args) {
         //Priority Queue


         Queue<Double> q = new LinkedList<>(); // queues are interfaces, can't be implemented directly.
         // use linked list as it implements Queue
         // if you write "PriorityQueue" elements will pop out in ascending order
         // if you write "PriorityQueue<>(Collections.reverseOrder());" iw will be desc 

         q.offer(9.2);
         q.offer(2.5);
         q.offer(3.0);
         q.offer(1.6);


         while(!q.isEmpty()){
             System.out.println(q.poll()); // remove elements, starting with the first offered.
         }
     }
 }
