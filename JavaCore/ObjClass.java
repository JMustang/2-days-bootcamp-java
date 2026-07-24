package JavaCore;

class Laptop {
    String model;
    int price;
}

public class ObjClass {
    public static void main(String a[]) {
        Laptop obj = new Laptop();
        obj.model = "Dell";
        obj.price = 30000;

        System.out.println(obj);
    }
}
