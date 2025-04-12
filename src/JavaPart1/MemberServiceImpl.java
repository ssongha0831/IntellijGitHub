package JavaPart1;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberServiceImpl implements MemberSer {

    private ArrayList<Member> list1 = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("이름 : ");
        String name = scanner.next();

        System.out.print("전화번호 : ");
        String phoneNum = scanner.next();
        list1.add(new Member(name, phoneNum));
    }

    @Override
    public void remove() {
        System.out.print("삭제할 연락처 이름 : ");
        String name = scanner.next();

        for (Iterator<Member> memberiter = list1.iterator(); memberiter.hasNext();) {
            Member member = memberiter.next();
            if (member.getName().equals(name)) {
                memberiter.remove();
                System.out.println("삭제  완료!");
                return;
            }
        }
    }

    @Override
    public void list() {
        for (int i = 0; i < list1.size(); i++) {
            Member member = list1.get(i);
            System.out.println(member.getName() + " - " + member.getPhoneNum());
        }
    }

    @Override
    public void serach() {
        System.out.print("검색할 이름 : ");
        String name = scanner.next();

        for (Member member : list1) {
            if (member.getName().equals(name)) {
                System.out.println(member.getName() + " - " + member.getPhoneNum());
            }

        }
    }

    @Override
    public void exit() {
        System.out.println("종료합니다.");
        System.exit(0);
    }
}
