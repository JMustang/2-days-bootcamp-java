package JavaCore;

//* FINAL pode ser: Variável, Método ou Classe.

//* Uma classe final não pode ser estendida (herdada) por outras classes.
final class Calc {

    // * Um método final não pode ser sobrescrito (overridden) por subclasses.
    public final void show() {
        System.out.println(" in Calc show!");
    }
}

/*
 * Variavel Final: Uma variável final é uma variável cujo valor não pode ser
 * alterado
 * uma vez que tenha sido atribuído. Isso significa que,
 * após a inicialização, o valor da variável final permanece constante durante
 * toda a execução do programa.
 */
public class demo2 {
    public static void main(String a[]) {
        /*
         * FINAL keyword funciona como uma constante,
         * ou seja, uma vez atribuído um valor a uma variável final,
         * este valor não pode ser alterado.
         */
        final int num = 8;
        num = 9; // *Essa linha vai gerar um erro de compilação, pois não é possível alterar o
                 // *valor de uma variável final.
        System.out.println(num);
    }
}
