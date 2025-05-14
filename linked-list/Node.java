public class Node {
    String content;
    Node next;
    Node prev;

    public Node(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}