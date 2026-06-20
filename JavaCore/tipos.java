package JavaCore;

public class tipos {
    // Tipos primitivos
    byte byteValue = 127; // 8 bits
    short shortValue = 32767; // 16 bits
    int num = 42; // 32 bits
    long longValue = 123456789L; // 64 bits

    float floatValue = 2.5f; // ponto flutuante simples
    double decimal = 3.14; // ponto flutuante duplo

    char letter = 'A'; // caractere Unicode
    boolean isTrue = true; // verdadeiro ou falso

    // Literais
    int literalDecimal = 100; // literal decimal
    int octal = 0144; // literal octal
    int hexadecimal = 0x64; // literal hexadecimal
    int binario = 0b1100100; // literal binário
    int comSeparador = 1_000_000; // literal com underscore

    double cientifico = 1.5e2; // notação científica
    char unicode = '\u0041'; // caractere Unicode
    char escape = '\n'; // caractere de escape

    // Tipos referenciais comuns
    String exempl = "Isso é uma string";
    Integer inteiroObjeto = 10;
    Double decimalObjeto = 3.14;

    public static void main(String[] args) {
        tipos t = new tipos();

        System.out.println("byte: " + t.byteValue);
        System.out.println("short: " + t.shortValue);
        System.out.println("int: " + t.num);
        System.out.println("long: " + t.longValue);
        System.out.println("float: " + t.floatValue);
        System.out.println("double: " + t.decimal);
        System.out.println("char: " + t.letter);
        System.out.println("boolean: " + t.isTrue);
        System.out.println("literalDecimal: " + t.literalDecimal);
        System.out.println("octal: " + t.octal);
        System.out.println("hexadecimal: " + t.hexadecimal);
        System.out.println("binario: " + t.binario);
        System.out.println("comSeparador: " + t.comSeparador);
        System.out.println("cientifico: " + t.cientifico);
        System.out.println("unicode: " + t.unicode);
        System.out.println("escape: " + t.escape);
        System.out.println("string: " + t.exempl);
    }
}
