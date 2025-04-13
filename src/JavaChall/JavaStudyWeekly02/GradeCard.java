package JavaChall.JavaStudyWeekly02;

import java.util.*;
//import java.util.Map;


public class GradeCard {

   private Map<String, Integer> gradeCard;

    public GradeCard() {
        this.gradeCard = new HashMap<>();
    }
    /*
    public HashMap<String, Integer> getGradeCard() {
        return (HashMap<String, Integer>) gradeCard;
    }
    public void setGradeCard(HashMap<String, Integer> gradeCard) {
        this.gradeCard = gradeCard;
    }
    */


    // add
    public void add (StudentScoreList studentScoreList) {
        gradeCard.put(studentScoreList.getStuName(), 0);
    }

    // remove
    public void delete(String stuName) {

        if (gradeCard.containsKey(stuName)) {
            gradeCard.remove(stuName);
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }
    }

    // grade
    public void gradPl(String stuName, Integer scoreLi) {
        System.out.println("성적이 추가되었습니다.");
        /*gradeCard.put()

        Map<String, Integer> gradeList = new HashMap<>();

        List<String> keyList
        //gradeCard.

        // if (!(gradeCard.get(stuName).equals(stuName)))

         */
    }

    // list
    public void getStudents(String stuName, Integer scoreLi) {
        /*
        Map<String, Integer> gradeList = new HashMap<>();

        List<Integer> valueList = new ArrayList<>(gradeList.values());
        System.out.println(stuName + "성적 : " + valueList);
        StudentScoreLi

         */
    }



}
