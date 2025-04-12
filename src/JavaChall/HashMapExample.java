package JavaChall;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        // 추가
        hashMap.put("A","a");
        hashMap.put("B","b");
        System.out.println(hashMap);

        // 삭제
        hashMap.remove("A");
        System.out.println(hashMap);

        // 중복값 추가
        hashMap.put("B", "bbbb");
        System.out.println(hashMap);

        // 조회
        System.out.println(hashMap.get("B"));
        System.out.println(hashMap.getOrDefault("A", "default"));
    }
}
