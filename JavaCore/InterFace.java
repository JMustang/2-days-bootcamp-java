package JavaCore;

// Exemplo de uso de interfaces em Java.
// Uma interface define um contrato: ela diz quais métodos uma classe deve implementar,
// mas não define como eles serão executados.
// Classes diferentes podem implementar a mesma interface de maneiras distintas.
public class InterFace {
    public static void main(String[] args) {
        // A variável abaixo é do tipo da interface, não da classe concreta.
        // Isso é um exemplo de polimorfismo: o mesmo tipo de referência pode apontar
        // para objetos diferentes.
        Animal cachorro = new Dog();
        Animal gato = new Cat();

        // Chamamos o método falar() de ambos os objetos.
        cachorro.falar();
        gato.falar();

        // Outro exemplo de polimorfismo: o método fazerSom aceita qualquer objeto que
        // implemente Animal.
        fazerSom(cachorro);
        fazerSom(gato);

        // O método dormir() é um método default na interface.
        // Ou seja, não precisa ser reimplementado em todas as classes.
        cachorro.dormir();
    }

    // Este método funciona com qualquer objeto que implemente a interface Animal.
    public static void fazerSom(Animal animal) {
        animal.falar();
    }
}

// Interface: define o contrato que as classes devem seguir.
interface Animal {
    // Método abstrato: toda classe que implementar Animal precisa criar essa
    // lógica.
    void falar();

    // Método default: já tem implementação, então as classes podem usar sem
    // reescrever.
    default void dormir() {
        System.out.println("O animal está dormindo.");
    }
}

// Classe que implementa a interface Animal.
class Dog implements Animal {
    @Override
    public void falar() {
        System.out.println("Au au!");
    }
}

// Outra classe que implementa a interface Animal.
class Cat implements Animal {
    @Override
    public void falar() {
        System.out.println("Miau!");
    }
}
