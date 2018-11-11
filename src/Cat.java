public class Cat implements Eater, MakeSound {
    private int length;
    private int age;
    private String name;

    public Cat(int length, int age, String name) {
        this.length = length;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Жрёт...");
    }

    @Override
    public void sound() {
        System.out.println("Орёт...");
    }
}
