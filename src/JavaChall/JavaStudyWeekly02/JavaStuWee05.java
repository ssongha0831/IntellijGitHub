// 송하연
/*
Member
https://github.com/ssongha0831/IntellijGitHub/blob/master/src/JavaChall/JavaStudyWeekly02/Member.java
MemberServiceImpl
https://github.com/ssongha0831/IntellijGitHub/blob/master/src/JavaChall/JavaStudyWeekly02/MemberServiceImpl.java
MemberSer
https://github.com/ssongha0831/IntellijGitHub/blob/master/src/JavaChall/JavaStudyWeekly02/MemberSer.java
*/

package JavaChall.JavaStudyWeekly02;
import java.util.Scanner;

public class JavaStuWee05 {
    public static void main(String[] args) {

        MemberSer service = new MemberServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("회원 관리 시스템 ( add, remove, list, check, exit )");
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
                case "check":
                    service.check();
                    break;
                case "exit":
                    service.exit();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
            System.out.println();
        }
    }
}
