package link;

public class NodeMain1 {

    public static void main(String[] args) {
        // 노드를 생성하고 연결하기
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.setNextNode(node2);
        node2.setNextNode(node3);

        System.out.println("모든 노드 탐색하기");
//        System.out.println("node1.getItem() = " + node1.getItem());
//        System.out.println("node1.getNext().getItem() = " + node1.getNext().getItem());
//        System.out.println("node1.getNext().getNext().getItem() = " + node1.getNext().getNext().getItem());

        Node next = node1;
        while (next != null) {
            System.out.println(next.getItem());
            next = next.getNext();
        }
    }
}
