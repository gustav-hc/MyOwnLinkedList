public class Main {

    public static void main(String[] args) {

        LinkedIntList list = new LinkedIntList();

        System.out.println("=== ADD TESTS ===");

        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);

        System.out.println("After addFirst/addLast:");
        list.printList();

        list.addAtIndex(2, 30);

        System.out.println("\nAfter addAtIndex(2, 30):");
        list.printList();


        System.out.println("\n=== GET TEST ===");

        System.out.println("Value at index 0: " + list.get(0));
        System.out.println("Value at index 2: " + list.get(2));
        System.out.println("Value at index 4: " + list.get(4));


        System.out.println("\n=== CONTAINS TEST ===");

        System.out.println("Contains 30: " + list.contains(30));
        System.out.println("Contains 100: " + list.contains(100));


        System.out.println("\n=== REMOVE FIRST TEST ===");

        list.removeFirst();

        System.out.println("After removeFirst:");
        list.printList();


        System.out.println("\n=== REMOVE LAST TEST ===");

        list.removeLast();

        System.out.println("After removeLast:");
        list.printList();


        System.out.println("\n=== REMOVE AT INDEX TEST ===");

        list.removeAtIndex(1);

        System.out.println("After removeAtIndex(1):");
        list.printList();


        System.out.println("\n=== ISEMPTY TEST ===");

        System.out.println("Is list empty: " + list.isEmpty());


        System.out.println("\n=== EXCEPTION TEST ===");

        try {
            list.get(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }


        System.out.println("\n=== REMOVE UNTIL EMPTY ===");

        while (!list.isEmpty()) {
            list.removeFirst();
        }

        System.out.println("Is list empty: " + list.isEmpty());

        System.out.println("\nFinal list:");
        list.printList();
    }
}