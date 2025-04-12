package JavaPart1;

//import java.util.ArrayList;
import java.util.Scanner;

public class JavaStudy04Ex {
    public static void main(String[] args) {

        MemberSer service = new MemberServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("연락처 관리 시스템 ( add, remove, list, search, exit )");
            System.out.print("명령 입력 : ");

            String select = scanner.next();
            switch (select) {
                case  "add":
                    service.add();
                    break;
                case "remove":
                    service.remove();
                    break;
                case "list":
                    service.list();
                    break;
                case "search":
                    service.serach();
                    break;
                case "exit":
                    service.exit();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}


