package JavaPart1;

// 프로그래밍 - 다형성

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // 1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student();
        //Student s2 = new Person();

        p1.print();
        s1.print();
        s1.print2();
        p2.print();
        //p2.print2(); // Person이 알고있는 것까지만 다형성 가능

        Person p3 = new CollegeStudent();
        //CollegeStudent c1 = new Student(); // Person이라는 같은 부모를 상속 받고 있지만 이런 방식의 다형성은 틀린방법!!
        p3.print();

        // 2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업캐스팅

        pp1 = pp2; //
        pp1 = ss2;

        ss1 = ss2;
        //ss1 = pp2;
        ss1 = (Student) pp3; // 다운캐스팅 : ( 업캐스팅으로

        //CollegeStudent cc1;
        //CollegeStudent cc2 = new CollegeStudent();
        //ss1 = (Student) cc2;
        //cc1 = (CollegeStudent) ss2;

        // 3. instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person);
        System.out.println(pe1 instanceof Student); // false

        System.out.println(st1 instanceof Student);
        System.out.println(st1 instanceof Person);

        System.out.println(pe2 instanceof Person);
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Person);
        System.out.println(pe3 instanceof CollegeStudent);

         if ( pe1 instanceof Student ) {
             Student stu1 = (Student) pe1;
         }

        if ( st1 instanceof Person ) {
            Person pr1 = (Person) st1;
        }

    }
}
