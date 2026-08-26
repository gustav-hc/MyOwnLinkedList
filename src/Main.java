public class Main {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(15);
        list.addLast(30);
        list.addLast(7);
        list.addLast(9);
//
        list.printList();
//        list.removeFirst();
        list.removeLast();
        list.printList();

    }
}

