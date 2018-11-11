public class Dog implements Eater, MakeSound{
    private int hunger;
    private int age;
    private String color;

    public Dog(int hunger, int age, String color) {
        this.hunger = hunger;
        this.age = age;
        this.color = color;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        if(hunger<=7){
            System.out.println("Жрёт");
            hunger = 10;
        }
        else System.out.println("Не голоден");
    }

    @Override
    public void sound() {
        System.out.println("Лает");
    }
}
