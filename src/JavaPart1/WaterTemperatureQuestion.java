package JavaPart1;

public class WaterTemperatureQuestion {
    public static void main(String[] args) {
        int waterTemperature = 0;

        for (waterTemperature = 1; waterTemperature <= 100; waterTemperature++) {
            if (waterTemperature == 100) {
                System.out.print("뮬온도 : " + waterTemperature + "도 ");
                System.out.println("물이 끓었습니다.");
                break;
            }
            if ((waterTemperature % 10) == 0) {
                System.out.println("물온도 : " + waterTemperature + "도 입니다.");
                continue;

            }
        }
    }
}
