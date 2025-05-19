/*
송하연
 */
package JavaChall.JavaStudyWeek02;
import java.util.*;

public class JavaStuWeek2_06 {
    public static void main(String[] args) {
        Map<String, List<Integer>> grade = new HashMap<>(); //
        Scanner scanner = new Scanner(System.in);

        System.out.println("성적 관리 시스템 (add, remove, grade, average, list, exit)");

        while (true) {
            System.out.print("명력 입력 : ");
            String command = scanner.nextLine();

            if ( command.equals("add") ) {
                System.out.print("학생 이름 : ");
                String name = scanner.nextLine();

                grade.putIfAbsent(name, new ArrayList<>());
                System.out.println("학생이 추가되었습니다.\n");

            } else if (command.equals("remove")) {
                System.out.print("삭제할 학생 이름 : ");
                String delName = scanner.nextLine();

                if (grade.containsKey(delName)) {
                    grade.remove(delName);
                    System.out.println("학생이 삭제되었습니다.\n");
                } else {
                    System.out.println("해당 학생이 없습니다.\n");
                }

            } else if (command.equals("grade")) {
                System.out.print("성적 추가할 학생 이름 : ");
                String nameAddGrade = scanner.nextLine();

                if (grade.containsKey(nameAddGrade)) {
                    System.out.print("성적 입력 : ");
                    int gradeNum = Integer.parseInt(scanner.nextLine());
                    grade.get(nameAddGrade).add(gradeNum);
                    System.out.println("성적이 추가되었습니다.\n");
                } else {
                    System.out.println("해당 학생이 없습니다.\n");
                }

            } else if (command.equals("average")) {
                System.out.print("평균 조회할 학생 이름 : ");
                String avgName = scanner.nextLine();
                if (grade.containsKey(avgName)) {
                    List<Integer> grades = grade.get(avgName);
                    double avg = grades.stream().mapToInt(i -> i).average().orElse(0.0);
                    System.out.printf("%s의 평균 성적 : %.2f\n", avgName, avg);
                    System.out.println();
                } else {
                    System.out.printf("%s의 학생은 찾을 수 없습니다.\n", avgName);
                }

            } else if (command.equals("list")) {
                System.out.println("학생 목록 : ");
                for (Map.Entry<String, List<Integer>> entry : grade.entrySet()) {
                    System.out.println(entry.getKey() + " - 성적 : " + entry.getValue());
                }
                System.out.println();

            } else if (command.equals("exit")) {
                System.out.println("프로그램 종료.");
                scanner.close();
                return;

            } else {
                System.out.println("명령어를 잘못 입력하셨습니다.\n");
            }
        }
    }
}
