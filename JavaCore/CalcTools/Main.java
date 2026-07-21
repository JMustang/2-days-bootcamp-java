package JavaCore.CalcTools;

/*
 * Exemplo de uso de packages em Java.
 *
 * O package JavaCore.CalcTools agrupa classes relacionadas a operações
 * matemáticas. Isso ajuda a organizar o código, evitar conflitos de nomes
 * e deixar o projeto mais fácil de manter.
 *
 * Em Java, o package geralmente segue a estrutura de pastas do projeto.
 * Por exemplo, esta classe está dentro da pasta JavaCore/CalcTools.
 */
public class Main {
    public static void main(String[] args) {
        // Como as classes estão no mesmo package, não precisamos importar nada.
        Calc calc = new Calc();
        AdvCalc advCalc = new AdvCalc();

        // Exemplos de operações básicas.
        int sum = calc.add(5, 3);
        int difference = calc.sub(10, 4);

        // Exemplos de operações avançadas.
        int product = advCalc.mul(6, 7);
        int quotient = advCalc.div(20, 5);

        // Exemplo extra: cálculo de média.
        double average = calc.average(10, 20);

        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + difference);
        System.out.println("Multiplicação: " + product);
        System.out.println("Divisão: " + quotient);
        System.out.println("Média: " + average);
    }
}
