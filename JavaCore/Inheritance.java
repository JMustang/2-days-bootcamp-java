package JavaCore;

// Classe pai (superclasse): define métodos básicos de cálculo.
class Calc {

    // Método da superclasse: soma dois números.
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Método da superclasse: subtrai dois números.
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Classe filha (subclasse): herda os métodos de Calc e adiciona novos.
class AdvCalc extends Calc {
    // Método novo da subclasse: multiplica dois números.
    public int mut(int n1, int n2) {
        return n1 * n2;
    }

    // Método novo da subclasse: divide dois números.
    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

public class Inheritance {
    public static void main(String a[]) {
        // Cria um objeto da classe pai.
        Calc c = new Calc();

        // Cria um objeto da classe filha, que também possui os métodos da pai.
        AdvCalc cc = new AdvCalc();

        // Usa métodos herdados da classe Calc.
        int r1 = c.add(13, 12);
        int r2 = c.sub(113, 15);

        // Usa métodos próprios da classe AdvCalc.
        int r3 = cc.mut(11, 15);
        int r4 = cc.div(110, 15);

        // Exibe os resultados.
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
