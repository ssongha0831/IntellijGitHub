// 송하연
/*
PhoneNumSer
https://github.com/ssongha0831/IntellijGitHub/blob/master/src/JavaChall/JavaStudyWeekly02/PhoneNumSer.java
PhoneSer
https://github.com/ssongha0831/IntellijGitHub/blob/master/src/JavaChall/JavaStudyWeekly02/PhoneSer.java
PhoneServiceImpl
https://github.com/ssongha0831/IntellijGitHub/blob/master/src/JavaChall/JavaStudyWeekly02/PhoneServiceImpl.java
*/
package JavaChall.JavaStudyWeekly02;
import java.util.Scanner;

public class JavaStuWee04 {
    public static void main(String[] args) {

        PhoneSer servicePh = new PhoneServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("연락처 관리 시스템 ( add, remove, list, search, exit )");
            System.out.print("명령 입력 : ");

            String select = sc.next();
            switch (select) {
                case  "add":
                    servicePh.add();
                    break;
                case "remove":
                    servicePh.remove();
                    break;
                case "list":
                    servicePh.list();
                    break;
                case "search":
                    servicePh.serach();
                    break;
                case "exit":
                    servicePh.exit();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
            System.out.println();
        }

    }

}
