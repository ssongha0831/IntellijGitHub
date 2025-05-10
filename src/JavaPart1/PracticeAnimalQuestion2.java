package JavaPart1;
// Practice2
// 아래 클래스와 상속 관계에서
// Test code를 수정하지 않고, 아래와 같이 출력될 수 있도록 오버라이딩 해보세요.
// 빵빵!
// 위이잉!
// 빵빵!
// 삐뽀삐뽀!

class Car {
    Car(){}
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {
    public void horn() {
        super.horn();
        System.out.println("위이잉!");
    }
}

class Ambulance extends Car {
    public void horn() {
        super.horn(); // 부모 객체에 있는 값을 출력할때
        System.out.println("삐뽀삐뽀!");
    }
}

public class PracticeAnimalQuestion2 {
    public static void main(String[] args) {
        // Test code
        Car car = new Car();
        FireTruck fireTruck = new FireTruck();
        Ambulance ambulance = new Ambulance();

        fireTruck.horn();
        ambulance.horn();
    }
}
