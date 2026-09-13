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
# 컬렉션 프레임워크 - 순회, 정렬, 전체 정리

## 순회 - Iterable, Iterator

### Iterable, Iterator
- Iterable: 반복 가능한
- Iterator: 반복자

### Iterator
- boolean hasNext()
    - 다음 요소가 있는지 확인
    - 다음 요소가 없으면 false
- E next();
    - 다음 요소를 반환
    - 내부에 있는 위치를 다음으로 이동

### 향상된 for문
- Iterable 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있게 해줌

---
## 정렬 - Comparable, Comparator

### 비교자 - Comparator
- int compare(T o1, T o2)
    - 첫 번째 인수가 더 작으면 음수 -1
    - 두 값이 같으면 0
    - 첫 번째 인수가 더 크면 양수 +1

- o1이 o2보다 작다 -> o1이 먼저 온다
- 두 원소 중 뭐가 앞에 와야하는가를 판단하는 기준
    - o1이 앞에 오게 하고 싶으면 -1을 반환하도록 하면 됨

### Comparable
- int compareTo(T o)

### 적용 가능 범위
- 배열 뿐만 아니라 순서가 있는 List 같은 자료구조에도 사용할 수 있음
- 순서가 없는 자료구조에는 사용할 수 없음 (set, map)

### Tree 구조와 정렬
- 정렬 기준을 제공하는 것이 필수임
- Comparable, Comparator가 필수임

---
## 전체 선택 가이드

- 순서가 중요하고 중복이 허용되는 경우
    - List
    - 보통은 ArrayList
    - 삽입/삭제 작업이 앞에서 빈번한 경우 => LinkedList

- 중복을 허용하지 않고 순서가 중요하지 않은 경우
    - Set
    - 보통은 HashSet
    - 순서를 유지해야하면 LinkedHashSet
    - 정렬된 순서가 필요하면 TreeSet

- 요소를 키-값 쌍으로 저장하려는 경우
    - Map
    - 순서가 중요하지 않다면 HashMap
    - 순서를 유지해야하면 LinkedHashMap
    - 정렬된 순서가 필요하면 TreeMap

- 요소를 처리하기 전에 보관해야하는 경우
    - Queue, Deque
    - 스택, 큐 구조 모두 ArrayDeque를 사용하는 것이 빠름
    - 만약 우선순위에 따라 요소를 처리해야한다면 PriorityQueue를 고려하자

### 최종 선택 가이드
- List => ArrayList
- Set => HashSet
- Map => HashMap
- Queue => ArrayDeque
*/
