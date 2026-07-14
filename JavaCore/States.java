package JavaCore;

class Mobile {
    String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // ===== EXEMPLO DE MÉTODO STATIC =====
    // Este é um método ESTÁTICO (static)
    // NÃO precisa de um objeto para ser chamado
    // Pertence à CLASSE Mobile, não a uma instância específica
    // Use: Mobile.ehCaro(1500) - sem criar um objeto
    public static boolean ehCaro(int preco) {
        return preco > 900;
    }

    // ===== EXEMPLO DE MÉTODO DE INSTÂNCIA (NÃO-STATIC) =====
    // Este é um método NORMAL (sem static)
    // PRECISA de um objeto para ser chamado
    // Pode acessar as variáveis de instância (brand, price, name)
    // Use: mob1.comparar(mob2) - precisa de um objeto
    public String comparar(Mobile outro) {
        if (this.price > outro.price) {
            return this.brand + " é mais caro que " + outro.brand;
        } else {
            return outro.brand + " é mais caro que " + this.brand;
        }
    }
}

public class States {
    // 'static' = palavra-chave que indica que o método pertence à CLASSE e não a
    // instâncias
    //
    // PARA QUE SERVE O STATIC?
    // 1. Permite chamar um método SEM criar um objeto da classe
    // 2. Pertence à classe inteira, não a um objeto específico
    // 3. Todas as instâncias compartilham a mesma cópia na memória
    //
    // POR QUE main() PRECISA SER STATIC?
    // - A JVM (máquina virtual Java) chama main() para iniciar o programa
    // - Ela faz isso ANTES de criar qualquer objeto
    // - Por isso main() deve ser static - não precisa de uma instância
    //
    // EXEMPLO DE DIFERENÇA:
    // - Método normal: precisa mob1.show() (criar objeto primeiro)
    // - Método static: pode chamar direto - États.main() sem criar objeto
    //
    public static void main(String a[]) {
        // Aqui criamos INSTÂNCIAS (objetos) da classe Mobile
        // Cada objeto tem seus próprios valores de brand, price e name

        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        mob1.price = 1000;
        mob1.name = "Iphone 13";

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 800;
        mob2.name = "Galaxy S21";

        // Chamando método de instância (não-static)
        // Cada objeto tem seu próprio show()
        mob1.show();
        mob2.show();

        System.out.println("\n===== EXEMPLOS DE MÉTODOS ESTÁTICOS =====\n");

        // ===== CHAMANDO MÉTODO STATIC =====
        // Sintaxe: NomeDaClasse.metodoStatic()
        // NÃO precisa criar um objeto
        // É como uma função utilitária da classe
        System.out.println("iPhone caro? " + Mobile.ehCaro(mob1.price));
        System.out.println("Samsung caro? " + Mobile.ehCaro(mob2.price));

        System.out.println("\n===== CHAMANDO MÉTODO DE INSTÂNCIA =====\n");

        // ===== CHAMANDO MÉTODO DE INSTÂNCIA (não-static) =====
        // Sintaxe: objeto.metodoInstancia()
        // PRECISA de um objeto para ser chamado
        // Pode usar as variáveis daquele objeto específico (this.price, this.brand,
        // etc)
        System.out.println(mob1.comparar(mob2));

    }
}
