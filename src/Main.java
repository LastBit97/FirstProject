public class Main {
    public static void main(String[] args) {
        Cat loki = new Cat(1, 2, "loki");
        Dog pudj = new Dog(6, 10, "black");
        Human dmitry = new Human(18);
        loki.eat();
        loki.sound();
        pudj.eat();
        pudj.sound();
        pudj.eat();
        System.out.println(dmitry.someMethod(dmitry.getAge()));
    }
}
