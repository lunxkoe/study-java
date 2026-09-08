package link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    /** 가장 마지막에 노드 추가 */
    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.setNextNode(newNode);
        }
        size++;
    }

    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.setNextNode(first);
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.setNextNode(prev.getNext());
            prev.setNextNode(newNode);
        }
        size++;
    }

    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.getItem();
        if (index == 0) {
            first = removeNode.getNext();
        } else {
            Node prev = getNode(index - 1);
            prev.setNextNode(removeNode.getNext());
        }
        removeNode.setItem(null);
        removeNode.setNextNode(null);
        size--;
        return removedItem;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.getItem();
        x.setItem(element);
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.getItem();
    }

    public int indexOf(Object e) {
        int index = 0;
        for (Node x = first; x != null; x = x.getNext()) {
            if (e.equals(x.getItem())) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                "}";
    }

    /** 마지막 노드 찾기 */
    private Node getLastNode() {
        Node currentNode = first;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /** 특정 인덱스 노드 찾기 */
    private Node getNode(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}
