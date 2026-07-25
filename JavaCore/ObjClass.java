package JavaCore;

// Classe = um modelo ou molde para criar objetos.
// Ela define as características (atributos) e os comportamentos (métodos) de um tipo de objeto.
class Car {
    // Atributos = características do objeto.
    String brand;
    String color;
    int year;

    // Método = ação que o objeto pode executar.
    void showInfo() {
        System.out.println("Marca: " + brand);
        System.out.println("Cor: " + color);
        System.out.println("Ano: " + year);
    }

    // Outro método para demonstrar comportamento.
    void drive() {
        System.out.println(brand + " está em movimento.");
    }
}

public class ObjClass {
    public static void main(String[] args) {
        // Objeto = uma instância concreta de uma classe.
        // Cada objeto pode ter valores diferentes para os mesmos atributos.
        Car car1 = new Car();

        // Atribuindo valores aos atributos do objeto car1.
        car1.brand = "Toyota";
        car1.color = "Prata";
        car1.year = 2022;

        // Chamando métodos do objeto car1.
        car1.showInfo();
        car1.drive();

        // Outro objeto da mesma classe, com valores diferentes.
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Preto";
        car2.year = 2020;

        car2.showInfo();
        car2.drive();

        // Resumo:
        // - Classe: define o modelo.
        // - Objeto: é a criação real baseada nesse modelo.
        // - Atributos: guardam dados.
        // - Métodos: executam ações.
    }
}
