package TestStuJava;

interface PaymentStrategy {
    void pay(int amount);
}
/*
class CardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("카드로 1000원 결제");
    }
}

class CashPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("현금으로 1000원 결제");
    }
}*/
public class StrategyExample {
    public static void main(String[] args) {
        //CardPayment cardPayment = new CardPayment();
        //cardPayment.pay(1000);

        //CashPayment cashPayment = new CashPayment();
        //cashPayment.pay(1000);

        PaymentStrategy strategy = (amount)-> {
            System.out.println("카드로 " + amount + "원 결제");
        };
        strategy.pay(1000);

        PaymentStrategy strategy2 = (amount)-> {
            System.out.println("현금으로 " + amount + "원 결제");
        };
        strategy2.pay(1000);
    }
}
