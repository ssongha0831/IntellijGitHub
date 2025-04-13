package JavaChall.JavaStudyWeekly02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneServiceImpl implements PhoneSer {

    private ArrayList<PhoneNumSer> list1 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("전화번호 : ");
        String phoneNum = sc.next();
        list1.add(new PhoneNumSer(name, phoneNum));

    }

    @Override
    public void remove() {
        System.out.print("삭제할 연락처 이름 : ");
        String name = sc.next();

        for (Iterator<PhoneNumSer> memberiter = list1.iterator(); memberiter.hasNext();) {
            PhoneNumSer member = memberiter.next();
            if (member.getName().equals(name)) {
                memberiter.remove();
                System.out.println("삭제 완료!");
                return;
            }
        }

    }

    @Override
    public void list() {
        for (int i = 0; i < list1.size(); i++) {
            PhoneNumSer member = list1.get(i);
            System.out.println(member.getName() + " - " + member.getPhoneNum());
        }

    }

    @Override
    public void serach() {
        System.out.print("검색할 이름 : ");
        String name = sc.next();

        for (PhoneNumSer member : list1) {
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
