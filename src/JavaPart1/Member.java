package JavaPart1;

public class Member {
    private String name;
    private String phoneNum;
    //private String valuPut;
    
    public Member(String name, String phoneNum) {
        super();
        this.name = name;
        this.phoneNum = phoneNum;
        //this.valuPut = valuPut;
    }


    // 이름
    public String getName() {
        return name;
    }
    
    //public void setName(String name) {
     //   this.name = name;
    //}

    // 전화번호
    public String getPhoneNum() {
        return phoneNum;
    }

   // public void setPhoneNum(String phoneNum) {
      //  this.phoneNum = phoneNum;
   // }

    // 입력값
    //public String valuPut() {
    //    return valuPut;
    //}

    //public void setvaluPut(String valuPut) {
      //  this.valuPut = valuPut;
    //}

}
