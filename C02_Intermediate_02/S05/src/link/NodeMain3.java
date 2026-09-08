package link;

public class NodeMain3 {

    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.setNextNode(node2);
        node2.setNextNode(node3);

        System.out.println(node1);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(node1);

        // 마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(node1);
        System.out.println(lastNode.getItem());

        // 특정 index의 노드 조회하기
        System.out.println("특정 index(2)의 노드 조회하기");
        int index = 2;
        Node index2Node = getNode(node1, index);
        System.out.println(index2Node.getItem());

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(node1, "D");
        System.out.println(node1);
        add(node1, "E");
        System.out.println(node1);
    }

    private static void printAll(Node node) {
        Node current = node;
        while (current != null) {
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }

    private static Node getLastNode(Node node) {
        Node current = node;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    private static Node getNode(Node node, int index) {
        Node current = node;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.setNextNode(new Node(param));
    }
}
