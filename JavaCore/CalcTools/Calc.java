package JavaCore.CalcTools;

/*
 * Classe responsável por operações matemáticas básicas.
 * Ela faz parte do package JavaCore.CalcTools.
 */
public class Calc {
    // Soma dois números inteiros.
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Subtrai o segundo número do primeiro.
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    // Exemplo extra: calcula a média entre dois valores.
    public double average(int n1, int n2) {
        return (n1 + n2) / 2.0;
    }
}
