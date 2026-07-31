package JavaCore;

public class AnoInnerClass {
    public static void main(String[] args) {
        AnoInnerClass obj = new AnoInnerClass();
        obj.display();
        obj.exemploComInterface();
        obj.exemploComClasseAbstrata();
    }

    void display() {
        int num = 23;

        // Uma inner class anônima é uma classe sem nome criada no momento
        // em que ela é instanciada. Ela é útil quando queremos sobrescrever
        // um método de uma classe ou implementar um método de uma interface
        // sem precisar criar uma classe separada.
        Object mensagem = new Object() {
            @Override
            public String toString() {
                return "Esse é um exemplo de inner class anônima.";
            }
        };

        System.out.println(mensagem);
        System.out.println("O valor do numero é: " + num);
    }

    void exemploComInterface() {
        // Outro exemplo: implementar uma interface com uma inner class anônima.
        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando tarefa via inner class anônima.");
            }
        };

        tarefa.run();
    }

    void exemploComClasseAbstrata() {
        // Também é possível estender uma classe abstrata sem criar uma classe nova.
        Animal animal = new Animal("Rex") {
            @Override
            void emitirSom() {
                System.out.println("Au au!");
            }
        };

        animal.falar();
    }

    abstract class Animal {
        private final String nome;

        Animal(String nome) {
            this.nome = nome;
        }

        void falar() {
            System.out.println("Eu sou " + nome);
            emitirSom();
        }

        abstract void emitirSom();
    }
}
