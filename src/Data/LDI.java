package Data;

public class LDI <T> {
    private class Node <T> {
        T info;
        Node prev;
        Node next;

        Node (T info) {
            this.info = info;
            this.prev = null;
            this.next = null;
        }
    }

    private Node <T> firstNode;
    private Node <T> lastNode;

    public LDI () {
        this.firstNode = null;
        this.lastNode = null;
    }

    @Override
    public String toString() {
        String display = "[";

        for (Node node = this.firstNode; node != null; node = node.next) {
            display += node.info.toString();
            if(node.next != null)
                display += ", ";
        }

        return display + "]";
    }

    // add

    // del
}
