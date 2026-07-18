package JavaCore;

class A {
    // Classe pai (superclasse)
    public A() {
        System.out.println("in A");
    }

    // Construtor da superclasse que recebe um inteiro
    public A(int n) {
        System.out.println("int n in A");
    }
}

class B extends A {
    // B herda de A
    public B() {
        // super(4) chama o construtor A(int n) da classe pai
        // Antes de executar o código de B, o Java executa o construtor de A
        super(4);
        System.out.println("in B");
    }

    // Construtor de B que recebe um inteiro
    // Aqui o 'super' não é usado, então o construtor padrão de A é chamado
    // automaticamente
    public B(int n) {
        System.out.println("int n in B");
    }
}

public class Super {
    public static void main(String a[]) {
        // Ao criar B(), o Java primeiro executa o construtor de B()
        // e dentro dele a chamada super(4) executa o construtor de A(int n)
        B obj = new B();
    }
}
