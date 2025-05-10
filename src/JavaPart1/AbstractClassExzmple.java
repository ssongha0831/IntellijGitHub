// 프로그램 - 추상클래스
package JavaPart1;

// 추상 클래스 Person
abstract class PersonAb {
    abstract void printInfo();
}

// 추상 클래스 상속
class StudentAb extends PersonAb {
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class AbstractClassExzmple {
    public static void main(String[] args) {
        // 추상 클래스의 사용
        // Person p1 = new Person();
        StudentAb s1 = new StudentAb();
        s1.printInfo();

        PersonAb p2 = new PersonAb() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
        p2.printInfo();
    }
}
