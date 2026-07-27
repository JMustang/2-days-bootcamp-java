package JavaCore;

public class DownUpCast {
    public static void main(String[] args) {
        // * Type casting é a conversão de um tipo em outro.
        // * Em Java, isso pode acontecer de forma implícita ou explícita.

        // *Exemplo 1: upcasting (subclasse -> superclasse)
        // *Aqui, um objeto Dog é tratado como Animal.
        // *Isso é seguro e acontece automaticamente.
        Dog dog = new Dog();
        Animal animal = dog; // *upcasting implícito
        animal.emitirSom();

        // *Exemplo 2: downcasting (superclasse -> subclasse)
        // *Aqui, um Animal precisa ser convertido de volta para Cat.
        // *Esse cast precisa ser feito manualmente.
        Animal animalGenerico = new Cat();
        if (animalGenerico instanceof Cat) {
            Cat cat = (Cat) animalGenerico; // *downcasting explícito
            cat.emitirSom();
        }

        // *Exemplo 3: downcasting inseguro
        // *Se o objeto não for do tipo esperado, o cast gera erro em tempo de execução.
        Animal outroAnimal = new Dog();
        if (outroAnimal instanceof Cat) {
            Cat cat2 = (Cat) outroAnimal;
            cat2.emitirSom();
        } else {
            System.out.println("Não é um gato, então não dá para fazer downcasting para Cat.");
        }

        // *Exemplo 4: casting de tipos primitivos
        // *Aqui, um double é convertido para int.
        // *A parte decimal é perdida.
        double valorDouble = 9.8;
        int valorInt = (int) valorDouble;
        System.out.println("valorInt = " + valorInt);
    }
}

class Animal {
    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Dog extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Au au!");
    }
}

class Cat extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Miau!");
    }
}
