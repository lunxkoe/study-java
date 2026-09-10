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
# 컬렉션 프레임워크 - 해시 (Hash)

## List vs Set

### List
- 요소들의 순차적인 컬렉션
- 순서 보장
- 중복 허용
- 인덱스 접근

### Set
- 유일한 요소들의 컬렉션
- 순서 비보장
- 중복 비허용
- 빠른 검색

---
## 해쉬 알고리즘 - index 사용

### 저장하는 데이터와 인덱스를 맞추면? (배열 사용)
- 인덱스 1 => 데이터 1
- 인덱스 5 => 데이터 5

### 얻을 수 있는 효과
- 데이터 1을 찾는 경우 => array[1]
- 데이터 5를 찾는 경우 => array[5]
- **성능: O(1)**

### 단점 (배열 사용)
- 낭비되는 공간이 발생함

---
## 해쉬 알고리즘 - 메모리 낭비

### 단순히 배열의 인덱스를 사용하는 경우의 문젬
- **메모리 낭비**
    - int의 경우로만 볼 경우에도 4Byte(42억 개의 배열이 필요함 -> 불가능)

---
## 해쉬 알고리즘 - 나머지 연산

### 공간 절약을 통해 넓은 범위의 값을 사용할 수 있는 방법
- **나머지 연산**
    - 1 % 10 = 1
    - 2 % 10 = 2
    - 5 % 10 = 5
    - 8 % 10 = 8
    - 14 % 10 = 4
    - 99 % 10 = 9

- 나머지 연산을 10으로 할 경우, 어떤 숫자가 들어와도 0 ~ 9의 범위를 넘지 않게 되므로 10 크기의 배열에 저장 가능
    - 중복 저장에 대한 문제가 발생할 수 있음 (여기서는 나머지 연산 알고리즘에만 집중)

### 해시 인덱스
- 배열의 인덱스로 사용할 수 있도록 원래의 값을 계산한 인덱스를 해시 인덱스라고 함
- 14의 해시 인덱스는 4 / 99의 해시 인덱스는 9
- 동작
    - value (1, 2, 5, 8, 14, 99)
    - hashIndex() == value % CAPACITY(10)
    - Array[10] = 0(none) | 1(1) | 2(2) | 3(none) | 4(14) | 5(5) | 6(none) | 7(none) | 8(8) | 9(99)

- 성능
    - hashIndex 생성: O(1)
        - 연산의 속도가 느려질 수는 있으나 데이터의 크기와는 크게 관련이 없기 때문에 O(1)
    - 저장: 인덱스를 계산해서 해당 인덱스로 바로 넣기 때문에 O(1)
        - 배열에서 인덱스로 해당 위치 찾기는 O(1)
    - 검색: 인덱스를 계산해서 해당 인덱스로 바로 접근하기 때문에 O(1)
        - 배열에서는 인덱스로 해당 위치 찾기는 O(1)

### 해시 충돌
- 10으로 해시 인덱스를 구할 경우
    - 1 % 10 = 1
    - 11 % 10 = 1
    - 1과 11은 다른 값인데 같은 해시 인덱스를 반환하므로, 같은 곳에 저장을 할 수 없는 문제가 발생함

---
## 해시 알고리즘 - 해시 충돌 설명

### 해시 충돌
- 10으로 해시 인덱스를 구할 경우
    - 1 % 10 = 1
    - 11 % 10 = 1
    - 1과 11은 다른 값인데 같은 해시 인덱스를 반환하므로, 같은 곳에 저장을 할 수 없는 문제가 발생함

### 해시 충돌 해결
- **해시 충돌 인정**
    - 낮은 확률로 일어날 수 있다고 가정
    - 해시 충돌이 일어났을 때 단순하게 같은 해시 인덱스의 값을 같은 인덱스에 함께 저장해버리는 것

- 배열 안에 배열을 만들면 됨
    - [1, 11]

### 해시 충돌 조회
- 해시 충돌이 일어나면 내부 데이터를 하나씩 보면 됨
- 여기서는 하나씩 비교해서 찾음: O(N)

### 정리
- 해시 인덱스를 사용하는 방식에서 최악의 경우에는 O(N)을 보이기도 함
- 확률적으로 보면 어느 정도 넓게 퍼지기 때문에 평균으로 보면 대부분 O(1)의 성능을 제공함

---
## 해시 충돌 해결

### 해시 충돌 확률
- 배열의 크기가 좀 커질 수록 충돌 확률이 줄어들고, 데이터의 분포가 고르게 분포될 확률이 높아짐
- 입력될 데이터의 크기
    - 저장할 데이터의 수가 배열의 크기를 75% 넘지 않으면 해시 인덱스는 자주 충돌하지 않음

### 정리
- 데이터 저장
    - 평균: O(1)
    - 최악: O(N)
- 데이터 조회
    - 평균: O(1)
    - 최악: O(N)
*/
