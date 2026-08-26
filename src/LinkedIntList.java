
public class LinkedIntList {
    private Node head;
    private Node tail;


    public LinkedIntList() {
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            tail = node;
        }
        node.setNext(head);
        head = node;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;

        } else {
            getTail().setNext(node);
            tail = node;
        }
    }


    public void printList() {
        Node current = getHead();
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();

        }
    }

    public boolean contains(int value) {
        Node current = getHead();
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            } else {
                current = current.getNext();
            }
        }
        return false;
    }

    public int get(int index) {

    }
}
