/*
송하연
 */
package JavaChall.JavaStudyWeek02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

abstract class ContactManager {
    public abstract void add();
    public abstract void remove();
    public abstract void search();
    public abstract void list();
}
class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 전화번호: " + phoneNumber;
    }
}

class ContactManagerImpl extends ContactManager {
    private List<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("이름 : ");
        String nameAdd = scanner.next().trim();

        System.out.print("전화번호 : ");
        String phoneNum = scanner.next().trim();

        if (nameAdd.isEmpty() || phoneNum.isEmpty()){
            System.out.println("이름과 전화번호는 비워둘 수 없습니다.\n");
            return;
        }

        for (Contact c : contacts) {
            if (c.getName().equals(nameAdd)) {
                System.out.println("이미 존재하는 이름입니다.\n");
                return;
            }
        }
        contacts.add(new Contact(nameAdd, phoneNum));
        System.out.println("연락처가 추가되었습니다.\n");
    }

    @Override
    public void remove() {
        System.out.print("삭제할 연락처 이름 : ");
        String nameDel = scanner.next();
        boolean found = false;

        for (Iterator<Contact> memberiter = contacts.iterator(); memberiter.hasNext();) {
            Contact member = memberiter.next();
            if (member.getName().equals(nameDel)) {
                memberiter.remove();
                System.out.println("삭제 완료!\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("존재하지 않는 이름입니다.\n");
        }
    }

    @Override
    public void search() {
        System.out.print("검색할 이름 : ");
        String nameSear = scanner.next();
        boolean found = false;

        for (Contact member : contacts) {
            if (member.getName().equals(nameSear)) {
                System.out.println(member.getName() + " - " + member.getPhoneNumber() + "\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("존재하지 않는 이름입니다.\n");
        }
    }

    @Override
    public void list() {
        for (int i = 0; i < contacts.size(); i++) {
            Contact member = contacts.get(i);
            System.out.println(member.getName() + " - " + member.getPhoneNumber());
        }
        System.out.println();
    }

    // 각 기능 (add, remove, search, list) 구현
}
public class JavaStuWeek2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManagerImpl();

        while (true) {
            System.out.println("연락처 관리 시스템 ( add, remove, list, search, exit )");
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
                case "search" :
                    manager.search();
                    break;
                case "exit" :
                    System.out.println("종료합니다.");
                    scanner.close();
                    return;
                default :
                    System.out.println("명령어를 다시 입력해주세요.\n");
            }
        }
    }
}
