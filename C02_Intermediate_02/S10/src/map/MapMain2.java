package map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100); // 같은 키에 저장 시 기존 값 교체
        System.out.println(studentMap);

        boolean contrainsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + contrainsKey);

        // 특정 학생의 값 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
