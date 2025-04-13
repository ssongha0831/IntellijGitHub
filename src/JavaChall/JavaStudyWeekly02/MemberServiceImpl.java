package JavaChall.JavaStudyWeekly02;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberSer {

    private ArrayList<Member> idList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {

        System.out.print("추가할 회원 ID : ");
        int id = scanner.nextInt();
        idList.add(new Member(id));
        System.out.println("회원이 추가 되었습니다.");
    }

    @Override
    public void remove() {
        boolean isFind = false;
        boolean isRun = true;

        while (isRun) {
            System.out.print("삭제할 회원 ID : ");
            int id = scanner.nextInt();

            for (int i = 0; i < idList.size(); i++) {
                if (idList.get(i).getId() == id) {
                    idList.remove(i);
                    System.out.println("회원이 삭제되었습니다.");
                    isFind = true;
                    isRun = false;
                }
            }
            if (!isFind) {
                System.out.println("존재하지 않는 회원 ID입니다.");
                break;
            }
        }
    }

    @Override
    public void list() {
        for (int i = 0; i < idList.size(); i++) {
            Member member = idList.get(i);
            System.out.println(member.getId());
        }
    }

    @Override
    public void check() {
        boolean isFind = false;
        boolean isRun = true;

        while (isRun) {
            System.out.print("검색할 회원 ID : ");
            int id = scanner.nextInt();

            for (int i = 0; i < idList.size(); i++) {
                if (idList.get(i).getId() == id) {
                    System.out.println("회원이 존재합니다.");
                    isFind = true;
                    isRun = false;
                }
            }
            if (!isFind) {
                System.out.println("존재하지 않는 ID입니다. 회원을 추가해주세요!");
                break;
            }
        }
    }


    @Override
    public void exit() {
        System.out.println("종료합니다.");
        System.exit(0);
    }
}
