package link;

public class NodeMain2 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.setNextNode(node2);
        node2.setNextNode(node3);

        System.out.println(node1); // [A->B->C]
        System.out.println(node2); // [B->C]
        System.out.println(node3); // [C]
    }
}
