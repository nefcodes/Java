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
        
        printLinkedList(head);

    }

    public static void printLinkedList(Node head){
        Node curr = head;
        while(curr!= null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
