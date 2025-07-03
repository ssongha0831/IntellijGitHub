package TestStuJava;

import java.io.*;
import java.util.*;

class Car {
    private String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public class Engine {
        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void showInfo() {
            System.out.println("자동차 모델명 : " + modelName);
            System.out.println("엔진 타입 : " + engineType);
        }
    }
}


public class main {
    public static void main(String[] args) throws IOException {
        Car car = new Car("소나타");
        Car.Engine engine = car.new Engine("가솔린");

        engine.showInfo();
    }
}