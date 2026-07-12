package JavaCore;

public class Car {
    private String modelo;
    private int ano;

    // Constructor: é um método especial usado para criar e inicializar um objeto.
    // Quando usamos "new Car(...)", este constructor é chamado automaticamente.
    // Ele recebe valores e os atribui aos atributos da classe.
    public Car(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void main(String a[]) {

        // Aqui o constructor é chamado automaticamente ao criar o objeto car1.
        Car car1 = new Car("Uno", 1994);

        System.out.println("Modelo: " + car1.getModelo() + ", Ano: " + car1.getAno());
    }

}
