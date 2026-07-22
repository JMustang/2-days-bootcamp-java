package JavaCore;

public class Polimorfismo {

    // Exemplo de polimorfismo de tempo de execução
    static class Animal {
        void emitirSom() {
            System.out.println("Animal fazendo som...");
        }
    }

    static class Cachorro extends Animal {
        @Override
        void emitirSom() {
            System.out.println("Au au!");
        }
    }

    static class Gato extends Animal {
        @Override
        void emitirSom() {
            System.out.println("Miau!");
        }
    }

    // Exemplo de polimorfismo de tempo de compilação (sobrecarga)
    static class Calculadora {
        int soma(int a, int b) {
            return a + b;
        }

        double soma(double a, double b) {
            return a + b;
        }

        int soma(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Polimorfismo de tempo de execução ===");

        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();
        Animal animal3 = new Animal();

        animal1.emitirSom(); // Au au!
        animal2.emitirSom(); // Miau!
        animal3.emitirSom(); // Animal fazendo som...

        System.out.println();
        System.out.println("=== Polimorfismo de tempo de compilação ===");

        Calculadora calc = new Calculadora();
        System.out.println("soma(int, int) = " + calc.soma(2, 3));
        System.out.println("soma(double, double) = " + calc.soma(2.5, 1.5));
        System.out.println("soma(int, int, int) = " + calc.soma(1, 2, 3));
    }
}

/*
 * O que
 * é Polimorfismo
 * Polimorfismo em
 * Java significa“muitas formas”.
 * É a
 * capacidade de
 * um objeto
 * ser tratado
 * como instância
 * de sua
 * própria classe
 * e também
 * como instância
 * de uma
 * superclasse.Isso permite
 * escrever código
 * mais genérico
 * e reutilizável.
 * 
 * Tipos principais
 * Polimorfismo de
 * tempo de
 * 
 * execução (dinâmico)
 * 
 * ocorre com herança +
 * 
 * método sobrescrito (override)
 * a chamada ao método é decidida em tempo de execução, com base no objeto real
 * Polimorfismo de tempo de compilação
 * 
 * também chamado de sobrecarga
 * 
 * de métodos (overload)
 * várias formas de um método com mesmo nome, mas assinaturas diferentes
 */