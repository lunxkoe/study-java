package list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        MyList<Integer> list1 = new MyArrayList<>();
        BatchProcessor processor1 = new BatchProcessor(list1);
        processor1.logic(50_000); // 3557ms

        MyList<Integer> list2 = new MyLinkedList<>();
        BatchProcessor processor2 = new BatchProcessor(list2);
        processor2.logic(50_000); // 5ms
    }
}
