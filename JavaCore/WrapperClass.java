package JavaCore;

public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper classes em Java são classes de objeto que representam tipos
        // primitivos.
        // Elas permitem usar valores primitivos como objetos, o que é necessário em
        // coleções
        // e APIs que trabalham apenas com objetos.

        // Tipos primitivos e seus wrappers correspondentes:
        // int -> Integer
        // long -> Long
        // double -> Double
        // float -> Float
        // boolean -> Boolean
        // char -> Character
        // byte -> Byte
        // short -> Short

        // Exemplo 1: Integer e int
        int num = 7;
        Integer numWrapper = num; // Auto-boxing: Java converte int para Integer automaticamente

        int numPrim = numWrapper; // Unboxing: Java converte Integer de volta para int automaticamente
        System.out.println("Unboxing de Integer para int: " + numPrim);

        // Exemplo 2: usando métodos da classe Integer
        String texto = "123";
        int convertido = Integer.parseInt(texto); // Converter String para int
        System.out.println("String convertida em int: " + convertido);

        Integer soma = Integer.valueOf(10) + Integer.valueOf(20); // Auto-unboxing para realizar a soma
        System.out.println("Soma de dois Integer: " + soma);

        // Exemplo 3: Double e double
        double valorDecimal = 3.14;
        Double doubleWrapper = valorDecimal; // Auto-boxing
        double resultado = doubleWrapper * 2; // Unboxing para operação aritmética
        System.out.println("Resultado com Double: " + resultado);

        // Exemplo 4: Boolean e boolean
        Boolean flagWrapper = Boolean.TRUE; // Criar um Boolean usando constante
        boolean flagPrim = flagWrapper; // Unboxing automático
        System.out.println("Boolean unboxed: " + flagPrim);

        // Exemplo 5: Character e char
        Character letraWrapper = 'A'; // Auto-boxing de char
        char letraPrim = letraWrapper; // Unboxing de Character
        System.out.println("Character unboxed: " + letraPrim);

        // Observação importante:
        // Wrappers são objetos e podem ser null. Primitivos não podem.
        Integer numeroNulo = null;
        System.out.println("Wrapper pode ser null: " + numeroNulo);

        // Cuidado: fazer unboxing de um wrapper nulo causa NullPointerException.
        // int erro = numeroNulo; // Descomente para ver o erro em tempo de execução
    }
}