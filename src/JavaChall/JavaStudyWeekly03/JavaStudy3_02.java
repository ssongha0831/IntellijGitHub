/*
송하연
 */
package JavaChall.JavaStudyWeekly03;
import java.util.ArrayList;
import java.util.Scanner;

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
    public void setName(String name) {
        this.name = name;
    }

    // 나이
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class AgeException implements AgeSer {
    private ArrayList<Age> ageList = new ArrayList<>();
    private Scanner scanner03 = new Scanner(System.in);

    @Override
    public void register() {
        System.out.print("이름 입력 : ");
        String name = scanner03.next();

        System.out.print("나이 입력 : ");
        int age = scanner03.nextInt();
        ageList.add(new Age(name, age));

        if (age <= 0) {
            System.out.println("나이는 0이상 입력해주세요!");
        } else if (age <= 19) {
            System.out.println("미성년자는 입력할 수 없습니다.");
        } else if (age <= 120) {
            System.out.println("사용자 등록 완료!");
        }

    }

    @Override
    public void list() {
        System.out.println("등록된 사용자 목록 : ");
        for (int i = 0; i < ageList.size(); i++) {
            Age ageListView = ageList.get(i);
            if (ageListView.getAge() >= 19 ) {
                //Age ageListView = ageList.get(i);
                System.out.println(ageListView.getName() + " (나이 : " + ageListView.getAge() + ")");
            }
        }
    }

    @Override
    public void exit() {
        System.out.println("종료합니다.");
        System.exit(0);
    }
}

interface AgeSer {
    public abstract  void register();
    public abstract  void list();
    public abstract  void exit();
}


public class JavaStudy3_02 {
    public static void main(String[] args) {
        AgeException ageException = new AgeException();
        Scanner scanner03 = new Scanner(System.in);


        while (true) {
            System.out.println("사용자 등록 시스템 (register, list, exit)");
            System.out.print("명령 입력 : ");
            String select = scanner03.next();

            switch (select) {
                case "register" :
                    ageException.register();
                    break;
                case "list" :
                    ageException.list();
                    break;
                case "exit" :
                    ageException.exit();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
            System.out.println();
        }
    }
}
