public class Human {
    private int age;
    private Cat loki;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String someMethod(int age) {
        String s;
        switch (age) {
            case 14:
                s = "Подросток";
                break;
            case 18:
                s = "Совершеннолетний";
                break;
            case 30:
                s = "Зрелый";
                break;
            default:
                s = "Не определено";
        }
        return s;
    }
}
