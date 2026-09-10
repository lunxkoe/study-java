package hashset;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA(int): " + (int)charA);
        System.out.println("charB(int): " + (int)charB);

        int hashCode = hashCode("AB");
        System.out.println("hashCode = " + hashCode);
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }
}
