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
# 컬렉션 프레임워크 - Map, Stack, Queue

## 컬렉션 프레임워크 - Map

### Map
- 키-값의 쌍을 저장하는 자료 구조
    - 키는 중복 될 수 없음
    - 값은 중복 될 수 있음
    - 순서를 유지하지 않음

### 구조
- Map
    - HashMap
        - LinkedMap
    - TreeMap

- key-value 쌍의 자료구조를 사용하기 때문에 별도의 Collection이 없고, Map이라는 인터페이스만 존재함

### 같은 키로 다른 값을 저장하면?
- put으로 넣을 시, 기존 값을 대체함
- 없으면 넣고 있으면 넣지 않고 싶은 경우
    - containsKey(key)
    - putIfAbsent(key, value)

---
## 컬렉션 프레임워크 - Map 구현체

### Key의 정체
- Key는 중복을 허용하지 않고, 순서를 보장하지 않음 (= Set)
- Map과 Set은 거의 동일함

### Set, Map
- HashSet => HashMap
- LinkedHashSet => LinkedHashMap
- TreeSet => TreeMap

### HashSet
- 사실 HashMap을 가져다 쓰고, value를 넣지 않을 뿐(더미 값)

### HashMap
- 구조: 해시를 사용해서 요소를 저장한, 키 값은 해시 함수를 통해 해시 코드로 변환되고, 이 해시 코드는 데이터를 저장하고 검색하는데 사용됨
- 특징: 삽입, 삭제, 검색 작업은 해시 자료 구조를 사용하므로 일반적으로 상수 시간 O(1)의 목잡도를 가짐
- 순서: 순서를 보장하지 않음

### LinkedHashMap
- 구조: LinkedHashMap은 HashMap과 유사하지만 연결 리스트를 사용하여 삽입 순서 또는 최근 접근 순서에 따라 요소를 유지
- 특징: 입력 순서에 따라 순회가 가능함, HashMap고 같지만 입력 순서를 링크로 유지해야하므로 조금 무거움
- 성능: HashMap과 유사하게 대부분의 작업은 O(1)의 시간 복잡도를 가짐
- 순서: 입력 순서를 보장함

### TreeMap
- 구조: 레드-블랙 트리를 기반으로 한 구현
- 특징: 모든 키는 자연 순서 또는 생성자에 제공된 Comparator에 의해 저장됨
- 성능: get, put, remove와 같은 주요 작업들은 O(logN)의 시간 복잡도를 가짐
- 순서: 키는 정렬된 순서로 저장됨

### 매우 주의!!!
- Map의 Key로 사용되는 객체는 hashCode(), equals()를 반드시 구현해야함!!
- containsKey(): O(1)
- containsValue() : O(N): 다 찾아봐야함

---
## 스택 자료 구조

### 스택
- First In Last Out
- 먼저 들어간 데이터가 가장 나중에 나옴 (후입선출 / 선입후출)

### 주의사항
- Stack 클래스는 사용하지 말자
- 자바의 Stack 클래스 내부에서 Vector라는 자료 구조를 사용하는데 지금은 사용되지 않음
- 이후에 설명할 Deque를 사용하는 것이 좋음

---
## 큐 자료 구조

### 큐
- First In First Out
- 먼저 들어간 데이터가 먼저 나옴 (선입선출)

### 컬렉션 프레임워크 구조
- Collection
    - Queue
        - Deque
            - ArrayDeque
            - LinkedList

### LinedList
- Deque와 List 인터페이스를 모두 구현함

---
## Deque

### Deque
- 양 쪽 끝에서 삽입/삭제를 할 수 있는 자료구조
- offerFirst(): 앞에 추가
- offerLast(): 뒤에서 추가
- pollFirst(): 앞에서 꺼냄
- pollLast(): 뒤에서 꺼냄

### 구현체
- ArrayDeque
- LinkedList

### 성능
- 100만건 입력(앞, 뒤, 평균)
    - ArrayDeque: 100ms
    - LinkedList: 480ms
- 100만건 조회(앞, 뒤, 평균)
    - ArrayDeque: 9ms
    - LinkedList: 20ms

### ArrayDeque vs LinkedList
- ArrayDeque: 원형 큐 자료 구조 사용
    - 덕분에 앞, 뒤, 입력 모두 O(1)
    - LinkedList도 O(1)

---
## Deque와 Stack, Queue

### Deque를 어떻게 활용하는지에 따라서 Stack, Queue로 변형이 가능함

### Deque - Stack / Queue
- Stack
    - ArrayDeque.push()
    - ArrayDeque.pop()

- Queue
    - ArrayDeque.offer()
    - ArrayDeque.pop()
    - 참고로 Queue - Deque이므로 Queue로 받아도 됨
*/
