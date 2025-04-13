package JavaChall.JavaStudyWeekly02;

public class StudentScoreList {

    private String stuName;
    private  int scoreLi;

    public StudentScoreList(String stuName, int scoreLi) {
        this.stuName = stuName;
        this.scoreLi = scoreLi;
    }

    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getScoreLi() {
        return scoreLi;
    }
    public void setScoreLi(int scoreLi) {
        this.scoreLi = scoreLi;
    }
}
