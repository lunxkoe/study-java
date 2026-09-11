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
# 컬렉션 프레임워크 - Set

## 자바 컬렉션 프레임워크 - HashSet, LinkedHashSet

### 구조
- Collection
    - Set
        - HashSet
            - LinkedHashSet
        - TreeSet

### HashSet
- 구현: 해시 자료 구조를 사용해서 요소를 저장
- 순서: 요소들은 특정한 순서 없이 저장됨
- 시간 복잡도: (추가, 삭제, 검색)은 평균적으로 O(1) 시간 복잡도
- 용도: **데이터의 유일성만 중요하고, 순서가 중요하지 않은 경우에 적합**

### LinkedHashSet
- 구현: HashSet에 연결 리스트를 추가해서 요소들의 순서를 유지함
- 순서: 요소들은 추가된 순서대로 유지됨
- 시간 복잡도: 주요 연산에 대해서 평균적으로 O(1) 시간 복잡도
- 용도: **데이터의 유일성과 함께 삽입 순서를 유지해야할 때 적합**
- 참고: 연결 링크를 유지해야하기 때문에 HashSet보다 조금 더 무거움

- 구성
    - 데이터를 넣을 때 노드를 저장함
    - 1 (prev, 2) / 2 (1, 5) / 14(5, next) / 5(2, 14)

---
## TreeSet

### TreeSet
- 구현: 이진 탐색 트리를 개선한 레드-블랙 트리를 내부에서 활용
- 순서: 요소들은 정렬된 순서로 저장됨 / 순서의 기준은 비교자(Comparator)로 변경할 수 있음
- 시간 복잡도: 주요 연산들은 O(logN)의 시간 복잡도를 가짐 / HashSet보다 느림
- 용도: 데이터를 정렬된 순서로 유지하면서 집합의 특성을 유지해야할 때 사용함
    - 범위 검색이나 정렬된 데이터가 필요한 경우에 유용함
    - 입력된 순서가 아니라 데이터 값의 순서
        - 3, 1, 2를 순서대로 입력해도 1, 2, 3 순서로 출력됨

### 트리 구조의 구현
- Node 0 (left, item, right)

### 핵심
- 데이터를 입력하는 시점에 정렬해서 보관하는 것
- 트리 구조이므로 O(logN)
    - 한 번에 절반을 날림

### 이진 탐색 트리의 성능
- 검색, 삽입, 삭제의 평균 성능은 O(logN)
- 최악의 경우(한쪽으로 치우져진 트리)에는 O(N)

### 개선
- 트리의 균형이 너무 깨진 경우에는 동적으로 균형을 다시 맞추는 것

---
## 자바 HashSet과 최적화

### 최적화
- 입력한 데이터의 수가 배열의 크기를 75%정도 넘어가면 해시 인덱스가 자주 충돌함
- 자바의 HashSet은 데이터의 양이 배열 크기의 75%를 넘어가면 배열의 크기를 2배로 늘리고 2배 늘어난 크기를 기준으로 모든 요소의 해시 인덱스를 다시 적용함

### 동작 방식
- 배열의 크기가 2배 증가, 해시 다시 계산
    - hashCode % CAPACITY(5) => hashCode % CAPACITY(10)
    - 실제로는 더 복잡하게 함

### 정리
- Set이 필요한 경우 HashSet을 가장 많이 사용함
- 입력 순서 유지 => LinkedHashSet
- 값 정렬 => TreeSet
*/
