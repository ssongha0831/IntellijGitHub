/*
송하연
 */
package JavaChall.JavaStudyWeek02;
import java.util.*;

abstract class MemberManager{
    public abstract void add();
    public abstract void remove();
    public abstract void check();
    public abstract void list();
}

class MemberManagerImpl extends MemberManager {
    private Set<Integer> memberIds = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("추가할 회원 ID : ");
        int id = Integer.parseInt(scanner.nextLine().trim());
        if (memberIds.contains(id)) {
            System.out.println("이미 등록된 회원 ID입니다.\n");
        } else {
            memberIds.add(id);
            System.out.println("회원이 추가 되었습니다.\n");
        }
    }

    @Override
    public void remove() {
        System.out.print("삭제할 회원 ID : ");
        try {
            int idDel = Integer.parseInt(scanner.nextLine().trim());

            if (memberIds.contains(idDel)) {
                memberIds.remove(idDel);
                System.out.println("회원이 삭제되었습니다.\n");
            } else {
                System.out.println("존재하지 않는 회원 ID입니다.\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("회원 ID는 숫자로만 입력해 주세요!\n");
        }
    }

    @Override
    public void check() {
        System.out.print("검색할 회원 ID : ");
        int idCheck = Integer.parseInt(scanner.nextLine().trim());

        if (memberIds.contains(idCheck)) {
            System.out.println("회원이 존재합니다.\n");
        } else {
            System.out.println("회원이 존재하지 않습니다.\n");
        }
    }


    @Override
    public void list() {
        List<Integer> sorted = new ArrayList<>(memberIds); // Set에서 List로 변환 ( HashSet은 정렬이 안되니까, 정렬 가능한 List로 변환 )
        Collections.sort(sorted); // 오름차순 정렬
        System.out.println("현재 회원 목록 : ");
        for (int id : sorted) { // for-each문으로 반복
            System.out.println(id);
        }
        System.out.println();
    }
}

public class JavaStuWeek2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberManager manager = new MemberManagerImpl();

        while(true){
            System.out.println("회원 관리 시스템 ( add, remove, list, check, exit )");

            System.out.print("명령 입력 : ");
            String command = scanner.nextLine();

            switch (command) {
                case "add" :
                    manager.add();
                    break;
                case "remove" :
                    manager.remove();
                    break;
                case "list" :
                    manager.list();
                    break;
                case "check" :
                    manager.check();
                    break;
                case "exit" :
                    System.out.println("프로그램 종료.");
                    scanner.close();
                    return;
                default :
                    System.out.println("명령어가 일치 하지 않습니다.");
            }
        }
    }
}
