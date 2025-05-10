package JavaPart1;
// 내부 클래스

// 내부 클래스 구조
class Outer {
    public void print() {
        System.out.println("Outer.print");
    }

    class Inner {
        public void innerPrint() {
            Outer.this.print();
        }
    }

    static class InnerStaticClass {
        void innerPrint() {
            //Outer.this.print();
        }
    }
}

abstract class PersonInn {
    public abstract void printInfo();
}

class StudentInn extends PersonInn {
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}
public class InnerClassExample {
    public static void main(String[] args) {
        // 외부 클래스
        Outer o1 = new Outer();

        // 내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner();

        // 내부 클래스 - 정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass();

        // 익명 클래스
        PersonInn p1 = new PersonInn() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
    }
}
