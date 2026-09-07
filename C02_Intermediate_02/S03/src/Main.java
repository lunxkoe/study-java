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
# Generic 2

### 와일드 카드는 이미 만들어진 제네릭 타입을 만들 때 사용하는 것임
### 와일드 카드는 제네릭 메서드가 아님
### super: 하한 (와일드 카드에만 사용 가능 / 제네릭 사용 불가)

## 타입 이레이저
- 제네릭은 자바 컴파일 단계에서만 사용
- 컴파일 이후에는 제네릭 정보가 삭제됨
- .java에는 타입 매개변수가 존재 O
- .class에서는 타입 매개변수가 존재 X

### 변경 기준
- 상한 X: Object
- 상한 O: 상한 클래스
*/
