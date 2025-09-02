public class Main {

    public static void main(String[] args) {
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        Node forty = new Node(40);
        Node fifty = new Node(50);

        Node head = ten; // just pointing to the first node, that's why its head

        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);

        head = insertAtFront(head, 5);
        printLinkedList(head);

    }

    public static void printLinkedList(Node head){
        Node curr = head;
        while(curr!= null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }

    public static Node insertAtFront(Node head, int data){ // takes old head as argument
        Node nn = new Node(data); //1. create new node

        nn.setNext(null);
        //edge case
        if(head == null){ // if existing head that we're trying to add in has head null,
            // just set the node that we're inserting at front, just replace with head
            head = nn;
        } else{ //(insert at front)  if LL has existing elements
            nn.setNext(head); // make first as next, and the new node as head
            head = nn;
        }
        return head;
    }
}
