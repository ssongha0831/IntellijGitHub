package JavaPart1;
// 아래 GreenOrc 클래스와 NPCSystem, UserSystem 인테페이스를 이용하여
// OrkNPC1, OrkUser1 클래스를 만들어보세요.

abstract class GreenOrc { // 추상 메소드
    public final String SKIN_COLOR = "녹색";
    public int health;
    public int attackDamage;
    public int defense; // 방어력

    public abstract void setHealth();
    public abstract void setDamage();
    public abstract void setDefense();
}

interface NPCSystem {
    public abstract void conversationSystem(); // 대화 시스템
    public abstract void questionSystem();
}

interface UserSystem {
    public abstract void partySystem(); // 파티 시스템
    public abstract void tradeSystem(); // 거래 시스템
}

// OrkNPC1 클래스
class OrkNPC1 extends GreenOrc implements NPCSystem {
    @Override
    public void setHealth() {
        this.health = 100;
    }

    @Override
    public void setDamage() {
        this.attackDamage = 10;
    }

    @Override
    public void setDefense() {
        this.defense = 5;
    }

    @Override
    public void conversationSystem() {
        System.out.println("안녕");
        System.out.println("요즘 새로운 소식 없나요?");
    }

    @Override
    public void questionSystem() {
        System.out.println("새로운 퀘스트");
        System.out.println("퀘스트 완료");
    }
}

// OrkUser1 클래스
class OrkUser1 extends GreenOrc implements UserSystem {
    @Override
    public void setHealth() {
        this.health = 200;
    }

    @Override
    public void setDamage() {
        this.attackDamage = 20;
    }

    @Override
    public void setDefense() {
        this.defense = 10;
    }

    @Override
    public void partySystem() {
        System.out.println("파티 초대");
        System.out.println("파티 수락");
    }

    @Override
    public void tradeSystem() {
        System.out.println("거래 신청");
        System.out.println("거래 완료");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        // Test code
        // no test code
    }
}
