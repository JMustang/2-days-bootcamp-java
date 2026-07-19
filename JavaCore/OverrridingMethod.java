package JavaCore;

// Classe base. Ela define o comportamento padrão.
class Animal {
    // Método que será sobrescrito nas subclasses.
    public void emitirSom() {
        System.out.println("Animal faz um som.");
    }

    // Método comum que não será sobrescrito neste exemplo.
    public void mostrarTipo() {
        System.out.println("Eu sou um animal.");
    }
}

// Subclasse que sobrescreve o método emitirSom.
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro late: au au!");
    }

    // Exemplo de uso de super() para reutilizar o comportamento da classe pai.
    public void latirComDetalhe() {
        super.emitirSom(); // chama o método da classe Animal.
        System.out.println("O cachorro também quer carinho.");
    }
}

// Outra subclasse com uma implementação diferente do mesmo método.
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato mia: miau!");
    }
}

public class OverrridingMethod {
    public static void main(String[] args) {
        // O método sobrescrito é escolhido de acordo com o objeto real,
        // mesmo que a variável seja do tipo da classe pai.
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.emitirSom(); // executa o comportamento do Cachorro
        animal2.emitirSom(); // executa o comportamento do Gato

        // A classe pai mantém o método mostrarTipo sem sobrescrita.
        animal1.mostrarTipo();

        // Exemplo explícito de super.
        Cachorro cachorro = new Cachorro();
        cachorro.latirComDetalhe();

        /*
         * O que é overriding?
         * É quando uma subclasse reescreve um método já definido na superclasse,
         * com a mesma assinatura (mesmo nome, mesmo tipo de retorno e mesmos
         * parâmetros).
         *
         * Vantagens:
         * 1. Permite comportamento específico em cada subclasse.
         * 2. Facilita o uso de polimorfismo.
         * 3. Mantém a mesma interface para várias implementações diferentes.
         *
         * Regra importante:
         * O método sobrescrito na subclasse deve ter a mesma assinatura da superclasse.
         * O uso de @Override é opcional, mas recomendado para deixar o código mais
         * claro.
         */
    }
}
