package JavaPart1;

public class GradeScoreQuestion {
    public static void main(String[] args) {
        /*
        // if문으로 만들기
        int score = 90;
        char grade = 0;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("grade : " + grade);
        */

        // switch문으로 만들기
        int score = 80;
        char grade = 0;

        switch (score){
            case 90 :
                grade = 'A';
                break;
            case 80 :
                grade = 'B';
                break;
            case 70 :
                grade = 'A';
                break;
            default :
                grade = 'F';
                break;
        }
        System.out.println("grade : " + grade);

    }
}
