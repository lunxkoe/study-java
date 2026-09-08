package link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    /** 가장 마지막에 노드 추가 */
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.setNextNode(newNode);
        }
        size++;
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.setNextNode(first);
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.setNextNode(prev.getNext());
            prev.setNextNode(newNode);
        }
        size++;
    }

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.getItem();
        if (index == 0) {
            first = removeNode.getNext();
        } else {
            Node<E> prev = getNode(index - 1);
            prev.setNextNode(removeNode.getNext());
        }
        removeNode.setItem(null);
        removeNode.setNextNode(null);
        size--;
        return removedItem;
    }

    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.getItem();
        x.setItem(element);
        return oldValue;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.getItem();
    }

    public int indexOf(E e) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.getNext()) {
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
    private Node<E> getLastNode() {
        Node<E> currentNode = first;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /** 특정 인덱스 노드 찾기 */
    private Node<E> getNode(int index) {
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    private static class Node<E> {
        private E item;
        private Node<E> next;

        public Node(E item) {
            this.item = item;
            this.next = null;
        }

        public E getItem() {
            return item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public void setNextNode(Node<E> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> next = this;
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
}
