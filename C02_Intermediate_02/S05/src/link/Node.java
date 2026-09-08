package link;

public class Node {

    private Object item;
    private Node next;

    public Node(Object item) {
        this.item = item;
        this.next = null;
    }

    public Object getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public void setNextNode(Node next) {
        this.next = next;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                "}";
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node next = this;
        sb.append("[");
        while (next != null) {
            sb.append(next.item);
            if (next.next != null) {
                sb.append("->");
            }
            next = next.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
