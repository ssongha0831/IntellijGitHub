package JavaPart1;

class Animal{
    String name;
    Double weight;
    String val;

    Animal(String name, Double weight, String val){
        this.name = name;
        this.weight = weight;;
        this.val = val;
    }

    public void printInfo(){
        System.out.print("name : " + name + ", ");
        System.out.print("weight : " + weight + ", ");
        System.out.print("val : " + val);
        System.out.println();
    }

    public void eat() {
        System.out.println("냠냠");
    }

    public void sleep() {
        System.out.println("쿨쿨");
    }

    public void walk() {
        System.out.println("걷기");
    }

    public void run() {
        System.out.println("뛰기");
    }

}

public class Practice {
    public static void main(String[] args) {
        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.printInfo();
        animal2.printInfo();
    }
}
