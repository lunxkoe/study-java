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
# 컬렉션 프레임워크 - HashSet

## 남은 문제
- 해시 인덱스를 사용하려면 데이터의 값을 배열의 인덱스로 사용해야함
- **배열의 인덱스는 숫자만 사용할 수 있음**
- **문자를 저장하기 위해서는 어떻게 해야할까?**

---
## 문자열 해시 코드

### 해시 코드와 해시 인덱스
- 문자 입력: A / B / AB
- 입력된 문자를 기반으로 해시 코드 생성: hashCode(): 65 / 66 / 131
- 추출된 해시 코드를 기반으로 해시 인덱스 생성: hashIndex(%10): 5 / 6 / 1

### 용어 정리
- 해시 함수 (Hash Function)
    - 임의의 길이의 데이터를 입력받고, 고정된 길이의 해시값을 출력하는 함수
    - 같은 데이터를 입력하면 항상 같은 해시 코드가 출력됨
    - 다른 데이터를 입력해도 같은 해시 코드가 출력될 수 있음 => 해시 충돌

- 해시 코드
    - 해시 함수를 통해서 만들어진 코드(해시값)

- 해시 인덱스
    - 데이터의 저장 위치를 결정하는데, 주로 해시 코드를 사용해서 만듦

---
## 자바의 hashCode()

### 동일성 / 동등성
- 동일성: == 연산자를 통해 두 객체의 참조가 **물리적**으로 동일한 객체를 가리키고 있는지 확인
- 동등성: equals() 메서드를 통해서 두 객체가 **논리적**으로 동등한지 확인

### equals()와 hashCode()
- Member 기준
    - equals에서 id가 같으면 같은 객체로 판단하도록 함
    - 만약 equals는 재정의 했는데, hashCode는 재정의하지 않으면, id가 같아도 다른 해시 코드를 반환하게 됨
    - **논리적으로 같은 경우** 같은 hashCode를 반환해야함

### 해시 자료구조 사용 시 매우 주의점
- equals, hashCode를 반드시 구현해야함!!

---
## equals, hashCode의 중요성
- 해시 자료구조를 사용한다면 반드시 구현
- 그렇지 않은 경우는 만들지 않아도 됨
- **해시 함수는 해시 코드가 최대한 충돌하지 않도록 설계**
*/
