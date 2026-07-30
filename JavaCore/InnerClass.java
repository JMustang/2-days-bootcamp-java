package JavaCore;

class A {
    int age = 25;

    public void show() {
        System.out.println("Metodo show() da classe externa A");
    }

    // Member inner class: é uma classe dentro de outra classe e depende da
    // instância
    // da classe externa A. Ela pode acessar diretamente os membros da classe
    // externa.
    class B {
        public void config() {
            System.out.println("Member inner class B: acesso age = " + age);
        }
    }

    // Static nested class: também é uma classe dentro de outra, mas é estática.
    // Ela não precisa de uma instância de A para ser criada e não pode acessar
    // diretamente variáveis de instância de A.
    static class C {
        public void message() {
            System.out.println("Static nested class C: não precisa de objeto A");
        }
    }

    public void useLocalClass() {
        // Local inner class: definida dentro de um método.
        // Só existe dentro deste método e pode ler variáveis locais efetivamente
        // finais.
        class LocalD {
            public void localMessage() {
                System.out.println("Local inner class D dentro de useLocalClass()");
            }
        }

        LocalD local = new LocalD();
        local.localMessage();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // Criar a instância da classe externa A
        A a = new A();
        a.show();

        // Criar a instância da member inner class B
        A.B innerB = a.new B();
        innerB.config();

        // Criar a instância da static nested class C
        A.C nestedC = new A.C();
        nestedC.message();

        // Usar local inner class dentro de um método da classe A
        a.useLocalClass();

        // Anonymous inner class: classe sem nome, usada uma vez apenas.
        // Aqui estendemos Runnable e implementamos run() no mesmo lugar.
        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class executando run()");
            }
        };
        tarefa.run();

        // Outro exemplo de anonymous inner class para interface simples
        Comparable<String> comparador = new Comparable<String>() {
            @Override
            public int compareTo(String o) {
                System.out.println("CompareTo chamado com: " + o);
                return 0;
            }
        };
        comparador.compareTo("texto");
    }
}
