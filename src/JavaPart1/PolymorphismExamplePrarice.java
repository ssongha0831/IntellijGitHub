package JavaPart1;
// 아래의 클래스와 상속 관계에서 다형성을 이용하여
// Car 객체를 통해 아래와 같이 출력될 수 있도록 Test code 부분을 구현해보세요.
// 빵빵!
// 위이잉!
// 삐뽀삐뽀!

class Car2 {
    Car2(){}
    public void horn() {System.out.println("빵빵!");}
}

class FireTruck2 extends Car2 {
    public void horn() {System.out.println("위이잉!");}
}

class Ambulance2 extends Car2 {
    public void horn() {System.out.println("삐뽀삐뽀!");}
}

public class PolymorphismExamplePrarice {
    public static void main(String[] args) {
        // Test code
        Car2 car2 = new Car2();
        Car2 carFire = new FireTruck2();
        Car2 carAmbul = new Ambulance2();

        car2.horn();
        carFire.horn();
        carAmbul.horn();

        // 정답
        /*
        Car2 car2 = new Car2();
        car2.horn();

        carFire = new FireTruck2();
        carFire.horn();

        carAmbul = new Ambulance2();
        carAmbul.horn();

        // 코딩 관점 -> 다형성을 사용하여 배열로 자식 객체들을 선언하고 for문으로 순회하며 모두 호출 가능
        Car2 car3[] = {new Car2(), new FireTruck2(), new Ambulance2()};
        for (Car2 item : car3) {
            item.horn();
        }
         */

    }
}
