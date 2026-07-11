package JavaCore;

class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Human {
    public static void main(String a[]) {
        Person p1 = new Person();
        p1.setAge(12);
        p1.setName("john");

        System.out.println(p1.getName() + " -> " + p1.getAge());
    }
}
