package TestStuJava;

import java.util.*;

public class MusicFavesManager {
    public static void main(String[] args) {
        Map<String, List<String>> music = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("노래 즐겨찾기 프로그램 ( adduser / addsong / removeuser / list / faves / exit )");
            System.out.print("명령어 입력 : ");
            String sel = scanner.nextLine().toLowerCase();

            switch (sel) {
                case "adduser" :
                    System.out.print("사용자 이름 : ");
                    String name = scanner.nextLine();
                    if (music.containsKey(name)) {
                        System.out.println("이미 존재하는 사용자 입니다.\n");
                    } else {
                        music.putIfAbsent(name, new ArrayList<>());
                        System.out.println(">> 사용자 등록 완료\n");
                    }
                    break;

                case "addsong" :
                    System.out.print("사용자 이름 : ");
                    String nameAdd = scanner.nextLine();
                    if (music.containsKey(nameAdd)){
                        System.out.print("노래 제목 : ");
                        String song = scanner.nextLine();
                        music.get(nameAdd).add(song);
                        System.out.println("즐겨찾기 추가 완료\n");
                    } else {
                        System.err.println("해당 사용자가 존재하지 않습니다.\n");
                    }
                    break;

                case "removeuser" :
                    System.out.print("삭제할 사용자 이름 : ");
                    String delName = scanner.nextLine();
                    if (music.remove(delName) != null){
                        System.out.println(">> 사용자가 삭제되었습니다.\n");
                    } else {
                        System.out.println(">> 해당 사용자가 없습니다.\n");
                    }
                    break;
                case "list" :
                    System.out.println(">> 모든 사용자 즐겨찾기");
                    for (Map.Entry<String, List<String>> entry : music.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue() + "\n");
                    }
                    break;

                case "faves" :
                    System.out.print("사용자 이름 : ");
                    String favesName = scanner.nextLine();
                    if (music.containsKey(favesName)){
                        /* 이렇게 하면 오류남 ( entrySet은 전체를 불러 올때 사용함
                        for (Map.Entry<String, List<String>> entry : music.entrySet()) {
                            System.out.println(">> 즐겨찾기 목록 : " + entry.getValue() + "\n");
                        }
                        */
                        System.out.println(">> " + favesName + "의 즐겨찾기 목록 : " + music.get(favesName) + "\n"); // 수정부분
                    } else {
                        System.out.println("사용자의 이름이 정확하지 않습니다.\n");
                    }

                    break;
                case "exit" :
                    System.out.println(">> 프로그램 종료!");
                    scanner.close();
                    return;

                default:
                    System.out.println("명령어를 다시 입력하세요.\n");
            }
        }
    }
}
