package JavaCore;

public class NamingConventions {
    public static void main(String a[]) {

        // Convenção de nomenclatura em Java

        // 1) Classes e interfaces usam PascalCase
        // Exemplo: Student, Game, Human
        String studentName = "Maria"; // variáveis usam camelCase

        // 2) Métodos também usam camelCase
        // Exemplo: getStudentName(), calculateTotal()
        System.out.println(studentName);

        // 3) Constantes usam UPPER_SNAKE_CASE
        // Exemplo: MAX_VALUE, DEFAULT_PORT
        final int MAX_VALUE = 100;
        System.out.println("Valor máximo: " + MAX_VALUE);

        // 4) Pacotes usam letras minúsculas
        // Exemplo: java.util, com.company.project

        // 5) Nomes devem ser significativos e claros
        int studentAge = 20; // melhor que usar nomes genéricos como x, y
        System.out.println("Idade do aluno: " + studentAge);
    }
}
