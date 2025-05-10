package JavaPart1;
// Practice1
// 아래의 클래스 및 상속 관계에서 Test code를 수정하지 않고
// Cat 클래스 내에서 super 또는 super()를 이용하여
// "고양이 입니다." 가 출력될 수 있도록 변경해보세요.

class Animal1 {
    String desc;

    Animal1() {
        this.desc = "동물 클래스 입니다.";
    }

    Animal1(String desc) { // 오버로딩된 생성자
        this.desc = desc;
    }

    public void printInfo() {
        System.out.println(this.desc);
    }
}

class Cat extends Animal1 {
    String desc;
    Cat() {
        //this.desc = "고양이 입니다.";
        //super.desc = desc; // 이거는 왜 나오는 걸까????
        //super.desc = "고양이 입니다."; // 방법1.
        super("고양이 입니다."); // 방법2.
    }
}

public class PracticeAnimalQuestion {
    public static void main(String[] args) {
        // Test code
        Cat cat = new Cat(); // 객체 생성
        cat.printInfo();
    }
}
