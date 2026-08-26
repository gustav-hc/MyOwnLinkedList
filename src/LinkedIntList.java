
public class LinkedIntList {
    private Node head;
    private Node tail;
    private int size = 0;


    public LinkedIntList() {
    }

    public int getSize() {
        return size;
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
        size++;
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
        size++;
    }


    public void printList() {
        Node current = getHead();
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();


        }
        System.out.println("Size of list: " + size);
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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Out of bounds");
        }
        Node current = getHead();
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Empty list");
        } else {
            setHead(getHead().getNext());
            size--;
        }
        if (size == 0) {
            setTail(null);
        }
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Empty list");
            return;
        }

        if (size == 1) {
            setTail(null);
            setHead(null);
            size--;
            return;
        }
        Node current = getHead();
        for (int i = 0; i < size; i++) {
            if (current.getNext() == tail) {
                current.setNext(null);
                setTail(current);
                size--;
                return;
            } else {
                current = current.getNext();
            }
        }
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Out of bounds");
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node current = getHead();
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
    }



    public boolean isEmpty() {
        return size == 0;
    }

    public void addAtIndex(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Out of bounds");
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node current = getHead();
        Node newNode = new Node(value);
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;



    }
}

