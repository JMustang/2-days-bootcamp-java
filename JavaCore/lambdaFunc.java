package JavaCore;

@FunctionalInterface
interface Soma {
    int apply(int a, int b);
}

public class lambdaFunc {
    public static void main(String[] args) {
        Soma soma = (a, b) -> a + b;

        System.out.println(soma.apply(5, 10));
    }

}
