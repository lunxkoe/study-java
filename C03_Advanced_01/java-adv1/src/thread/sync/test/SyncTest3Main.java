package thread.sync.test;

public class SyncTest3Main {

    public static void main(String[] args) {

    }

    static class Immutable {

        private final int value;

        public Immutable(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // 멀티 스레드 상황에서 문제가 없음
    // - 공유 자원에 접근하는게 문제가 아님
    // - 공유 자원에 접근해서 **값을 변경하는 것**이 실제 문제임
    // - final을 값이 한 번 정해지면 변경이 불가능하기 때문에 멀티 스레드 환경에서도 아무런 문제 없이 동작함
}
