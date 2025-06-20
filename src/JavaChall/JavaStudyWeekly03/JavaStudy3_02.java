/*
송하연
 */
package JavaChall.JavaStudyWeekly03;
import java.util.ArrayList;
import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException() {
        super("미성년자는 입력할 수 없습니다.");
    }
}

class Age {
    private String name;
    private int age;

    public Age(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 이름
    public String getName() {
        return name;
    }

    // 나이
    public int getAge() {
        return age;
    }
}

class AgeService {
    private ArrayList<Age> ageList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void register() {
        try {
            System.out.print("이름 입력 : ");
            String name = scanner.next();
            System.out.print("나이 입력 : ");
            int age = scanner.nextInt();

            if (age < 1) {
                System.out.println("나이는 1 이상 입력해주세요!");
                return;
            }
            if (age < 18) {
                throw new UnderageException();
            }

            ageList.add(new Age(name, age));
            System.out.println("사용자 등록 완료!");
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        }

    }

    public void list() {
        System.out.println("등록된 사용자 목록 : ");
        for (int i = 0; i < ageList.size(); i++) {
            Age ageListView = ageList.get(i);
            if (ageListView.getAge() >= 18 ) {
                System.out.println(ageListView.getName() + " (나이 : " + ageListView.getAge() + ")");
            }
        }
    }

    public void exit() {
        System.out.println("종료합니다.");
        System.exit(0);
    }
}

public class JavaStudy3_02 {
    public static void main(String[] args) {
        AgeService  ageService = new AgeService ();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("사용자 등록 시스템 (register, list, exit)");
            System.out.print("명령 입력 : ");
            String select = scanner.next();

            switch (select) {
                case "register" :
                    ageService .register();
                    break;
                case "list" :
                    ageService .list();
                    break;
                case "exit" :
                    ageService .exit();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
            System.out.println();
        }
    }
}
