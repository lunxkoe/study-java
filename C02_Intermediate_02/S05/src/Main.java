//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

/*
# 컬렉션 프레임워크 - LinkedList

## 노드와 연결 1

### 배열 리스트의 단점
- 배열 리스트는 내부에 배열을 사용해서 데이터를 보관하고 관리하여, 다음과 같은 단점을 가짐
    - 배열의 사용하지 않는 공간 낭비
    - 배열의 중간에 데이터 삽입/삭제

### 노드와 연결
- 낭비되는 메모리 없이 딱 필요한 만큼만 메모리를 확보해서 사용하고, 도 앞이나 중간에 데이터를 추가하거나 삭제할 때도 효율적인 자료구조
- 노드를 만들고, 각 노드를 연결하는 방식

- 노드에 데이터 추가 및 연결
    - Node0 (data: "A", next: Node1)
    - Node1 (data: "A", next: Node2)
    - Node2 (data: "B", next: null)
*/