package TestQuiz.Weekely01;

import java.util.Scanner;

class Gender extends JavaStudySelection02 {
    private String gender;
/*
    public String getGender() {
        return gender;
    }
    public String getGenderSelM() {
        return GenderSelM;
    }
    public String getGender() {
        return GenderSelF;
    }

    public String setGenderSelM {
        int setGenderSelM = 3;
        return GenderSelM;
    }

    public String setGenderSelF {
        int setGenderSelF = 4;
        return GenderSelF;
    }

 */
}

public class JavaStudySelection02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");

        System.out.print("출생연도를 입력해 주세요.(yyyy):");
        int year[] = new int[]{scanner.nextInt()};

        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = scanner.nextInt();

        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = scanner.nextInt();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = scanner.next();

        int year1 = year[2] + year[3];

        // 배열로 접근하여 값을 부르는것으로 해보기!!

        /*
        switch (gender) {
            case "m" :
                int genderSelM = 3;
                break;
            case "f" :
                int genderSelF = 4;
                break;
            default:
                System.out.println("성별을 바르게 입력해주세요!");
        }

         */
        //int genderSelM;
/*
        Gender genderSel = new Gender();
        if (genderSel == 3) {
            System.out.println(year1+month+day " - " + genderSelM+);
        }
        System.out.println(year1+month+day " - " + );

 */
    }
}
