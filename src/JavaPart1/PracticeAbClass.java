// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

package JavaPart1;

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device {
    UsbPort1(int id) { // 생성자
        this.deviceId = id;
    }

    // 추상 메소드
    void deviceInfo() {
        System.out.println("id = " + this.deviceId);
    }

    void connect() {
        System.out.println("연결 하였습니다.");
    }

    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }

    void send() {
        System.out.println("데이터를 전송합니다.");
    }

    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}

// WiFi 클래스
class WiFi extends Device {
    public WiFi(int id) { // 생성자
        this.deviceId = id;
    }

    // 우클릭 제너레이트  ( 오버라이드 자동 완성 )
    @Override
    void deviceInfo() {
    }

    @Override
    void connect() {
    }

    @Override
    void disconnect() {
    }

    @Override
    void send() {
    }

    @Override
    void receive() {
    }
}

public class PracticeAbClass {
    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi = new WiFi(0);
    }
}
