package JavaCore;

public class condicionais {
    public static void main(String[] args) {
        int idade = 18;
        int contador = 0;
        int tentativa = 0;

        String status = (idade >= 18) ? "maior de idade" : "menor de idade";
        System.out.println("Operador ternário: " + status);

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else if (idade >= 13) {
            System.out.println("Você é adolescente.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        while (contador < 3) {
            System.out.println("While: contador = " + contador);
            contador++;
        }

        do {
            System.out.println("Do-while: tentativa = " + tentativa);
            tentativa++;
        } while (tentativa < 3);

        for (int i = 0; i < 5; i++) {
            System.out.println("For: contagem = " + i);
        }

        String[] nomes = { "Ana", "Bruno", "Carlos" };
        for (String nome : nomes) {
            System.out.println("For-each: " + nome);
        }

        switch (idade) {
            case 18:
                System.out.println("Switch: você acabou de se tornar maior de idade.");
                break;
            case 21:
                System.out.println("Switch: você agora pode beber legalmente em muitos países.");
                break;
            default:
                System.out.println("Switch: idade = " + idade);
        }

        if (idade >= 18 && contador >= 3) {
            System.out.println("Condicional com &&: idade é suficiente e contador terminou.");
        }

        if (idade < 18 || tentativa > 0) {
            System.out.println("Condicional com ||: pelo menos uma condição é verdadeira.");
        }
    }
}