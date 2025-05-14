public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insertAtEnd("Budi");
        list.insertAtBeginning("Andi");
        list.insertAtEnd("Citra");
        list.insertAtEnd("Dewi");

        // Print the list
        System.out.println("Linked List after insertions:");
        list.printListForward(); // Expected Forward: Andi -> Budi -> Citra -> Dewi -> null
        list.printListBackward(); // Expected Backward: Dewi -> Citra -> Budi -> Andi -> null

        // Insert after a specific node
        Node nodeBudi = list.getNode("Budi");
        if (nodeBudi != null) {
            list.insertAfter(nodeBudi, "Eka");
        }

        // Print the list after insertAfter
        System.out.println("\nLinked List after inserting Eka after Budi:");
        list.printListForward(); // Expected Forward: Andi -> Budi -> Eka -> Citra -> Dewi -> null
        list.printListBackward(); // Expected Backward: Dewi -> Citra -> Eka -> Budi -> Andi -> null

        // Delete a node
        list.deleteNode("Citra");

        // Print the list after deletion
        System.out.println("\nLinked List after deleting Citra:");
        list.printListForward(); // Expected Forward: Andi -> Budi -> Eka -> Dewi -> null
        list.printListBackward(); // Expected Backward: Dewi -> Eka -> Budi -> Andi -> null

        // Delete a non-existent node
        list.deleteNode("Fajar");

        // Print the list after trying to delete non-existent node
        System.out.println("\nLinked List after trying to delete Fajar:");
        list.printListForward(); // Expected Forward: Andi -> Budi -> Eka -> Dewi -> null
        list.printListBackward(); // Expected Backward: Dewi -> Eka -> Budi -> Andi -> null
    }
}