package game;

class Hello {
    public static void main(String a[]) {
        System.out.println("Hello World!🖖🏻\n");

        Add add = new Add();
        int result = add.add(3, 7);
        System.out.println("Result is: " + result);
    }

}

public class Add

{

    int add(int a, int b) {
        return a + b;

    }
}
