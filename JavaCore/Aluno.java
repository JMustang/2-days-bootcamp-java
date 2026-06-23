package JavaCore;

public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private String serie;
    private double[] notas;
    private boolean[] fezProva;
    private double media_provas;

    // Construtor
    public Aluno(int matricula, String nome, int idade, String serie) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
        this.notas = new double[2];
        this.fezProva = new boolean[2];
        this.media_provas = 0.0;
    }

    public void registrarNota(int semestre, double nota) {
        if (semestre < 1 || semestre > 2) {
            System.out.println("❌ Semestre invalido! Use 1 ou 2.");
            return;
        }
        if (nota < 0 || nota > 10) {
            System.out.println("❌ Nota invalida! Use valore entre 0 e 10.");
            return;
        }

        this.notas[semestre - 1] = nota;
        this.fezProva[semestre - 1] = true;
        calcularMedia();
    }

    // Calcular a media apenas das provas feitas
    private void calcularMedia() {
        int provasFeitas = 0;
        double soma = 0;

        for (int i = 0; i < 2; i++) {
            if (fezProva[i]) {
                soma += notas[i];
                provasFeitas++;
            }
        }

        this.media_provas = provasFeitas > 0 ? soma / provasFeitas : 0;
    }

    // Verifica se fez todas as provas
    public boolean fezTodasAsProvas() {
        return fezProva[0] && fezProva[1];
    }

    // Retorna situação do aluno
    public String getSituacao() {
        if (!fezTodasAsProvas()) {
            return "🚨 PENDENTE (Faltam provas)";
        } else if (media_provas >= 7.0) {
            return "✅ APROVADO";
        } else if (media_provas >= 5.0) {
            return "♻️ RECUPERAÇÂO";
        } else {
            return "❌ REPROVADO";
        }
    }

    // Exibe informações do aluno
    public void exibirDados() {
        System.out.println("================================");
        System.out.println("Matrícula : " + matricula);
        System.out.println("Nome      : " + nome);
        System.out.println("Idade     : " + idade + " anos");
        System.out.println("Série     : " + serie);
        System.out.println("Prova 1   : " + (fezProva[0] ? notas[0] : "Não realizada"));
        System.out.println("Prova 2   : " + (fezProva[1] ? notas[1] : "Não realizada"));
        System.out.println("Média     : " + String.format("%.2f", media_provas));
        System.out.println("Situação  : " + getSituacao());
        System.out.println("================================");
    }

    // Getters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media_provas;
    }
}
