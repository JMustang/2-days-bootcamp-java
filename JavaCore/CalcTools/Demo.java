package JavaCore.CalcTools;

class A {
    public void show() {
        System.out.println("in A Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {

    public void show() {
        System.out.println("in C show");
    }
}

public class Demo {
    public static void main(String a[]) {
        A obj = new A();
        obj.show();

        B obj2 = new B();
        obj2.show();

        C obj3 = new C();
        obj3.show();
    }
}
