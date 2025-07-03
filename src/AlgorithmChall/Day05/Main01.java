package AlgorithmChall.Day05;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(List.of("호랑이","사자","팬더","고양이","고릴라"));
        set.removeAll(Set.of("호랑이","사자","팬더"));
        System.out.println(set);
    }
}
