// 송하연
/*
GradeCard
https://github.com/ssongha0831/IntellijGitHub/blob/master/src/JavaChall/JavaStudyWeekly02/GradeCard.java
StudentScoreList
https://github.com/ssongha0831/IntellijGitHub/blob/master/src/JavaChall/JavaStudyWeekly02/StudentScoreList.java
 */
package JavaChall.JavaStudyWeekly02;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaStuWee06 {
    //private static Scanner scan = new Scanner(System.in);

    public static  void main(String[] args) {
        GradeCard gradeCard = new GradeCard();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("성적 관리 시스템 ( add, remove, grade, average, list, exit )");
            System.out.print("명령 입력 : ");

            String sel = scan.next();

            if ( sel.equals("add") ) {
                System.out.print("학생 이름 : ");
                String stuName = scan.next();

                StudentScoreList studentScoreList = new StudentScoreList(stuName, 0);
                gradeCard.add(studentScoreList);

            } else if ( sel.equals("remove") ) {
                System.out.print("삭제할 학생 이름 : ");
                String stuName = scan.next();
                gradeCard.delete(stuName);

            } else if ( sel.equals("grade") ){
                System.out.print("성적 추가할 학생 이름 : ");
                String stuName = scan.next();
                System.out.print("성적 입력 : ");
                int scoreLi = scan.nextInt();
                gradeCard.gradPl(stuName, scoreLi);
                // 입력 받은 이름을 비교하여 같은 이름이 있으면 성적을 배열로 저장

            } else if ( sel.equals("average") ){
                System.out.print("평균 조회할 학생 이름 : ");
                /*
                grade에서 입력한 성적을 배열 또는 List로 받아서
                점수를 for을 돌려서 입력된 값 만큼 더하고 나누기
                 */


            } else if ( sel.equals("list") ){
                ArrayList<GradeCard> gradeList = new ArrayList<>();

                System.out.println("학생 목록 : ");
                for (int i = 0; i < gradeList.size(); i++) {
                    String stuName = "";
                    gradeCard.getStudents(stuName, i);
                    //StudentScoreLi studentScoreLi= new StudentScoreList(stuName, gradeList[]);

                }
                // grade에서 입력 받은 성적을 배열로 받아 저장하고 이중 Map을 사용하여 이름과 성적을 불러오기

            } else if ( sel.equals("exit") ){
                System.out.print("프로그램 종료.");
                System.exit(0);
            } else  {
                System.out.println("잘못 입력하셨습니다.");
            }

            System.out.println();
        }
    }

}
