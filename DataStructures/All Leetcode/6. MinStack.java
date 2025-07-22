public class MinStack {

    private Node head; // reference data type Node, that we will define below

    public MinStack(){

    }


    public void push(int val){

         //head is a Node type, it can eithe point to a head(node) object
        // or point to nothing be null
        if(head == null){
            head = new Node(val, val, null);
        }
        else{
            head = new Node(val, Math.min(val, head.min), head); //next (argument)(a node type val
        }
    }
    public void pop(){
        head = head.next;
    }

    public int top(){
        return head.val; // node.val of node called "head"
    }

    public int getMin(){
        return head.min;
    }

    private class Node { // funny how Node class, can contain a Node element, even though
        // we are just creating node class X_X
        int val;
        int min;
        Node next;

        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
