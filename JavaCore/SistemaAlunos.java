package JavaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAlunos {

    private List<Aluno> alunos = new ArrayList<>();
    private int contadorMatricula = 1000;
    private Scanner scanner = new Scanner(System.in);

    // Cadastra um novo aluno
    public void cadastrarAluno() {
        System.out.println("\n--- CADASTRAR ALUNO ---");

        System.out.print("Nome  : ");
        String nome = scanner.nextLine();

        System.out.print("Idade : ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Série : ");
        String serie = scanner.nextLine();

        int matricula = ++contadorMatricula;
        Aluno aluno = new Aluno(matricula, nome, idade, serie);
        alunos.add(aluno);

        System.out.println("✅ Aluno cadastrado com matrícula: " + matricula);
    }

    // Registra nota de um aluno
    public void registrarNota() {
        System.out.println("\n--- REGISTRAR NOTA ---");

        System.out.print("Matrícula do aluno: ");
        int matricula = scanner.nextInt();

        Aluno aluno = buscarAluno(matricula);
        if (aluno == null) {
            System.out.println("❌ Aluno não encontrado!");
            return;
        }

        System.out.print("Semestre (1 ou 2): ");
        int semestre = scanner.nextInt();

        System.out.print("Nota (0 a 10): ");
        double nota = scanner.nextDouble();
        scanner.nextLine();

        aluno.registrarNota(semestre, nota);
        System.out.println("✅ Nota registrada com sucesso!");
    }

    // Busca aluno por matrícula
    private Aluno buscarAluno(int matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                return a;
            }
        }
        return null;
    }

    // Lista todos os alunos
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("\n--- LISTA DE ALUNOS ---");
        for (Aluno a : alunos) {
            a.exibirDados();
        }
    }

    // Exibe alunos com provas pendentes
    public void verificarPendentes() {
        System.out.println("\n--- ALUNOS COM PROVAS PENDENTES ---");
        boolean encontrou = false;
        for (Aluno a : alunos) {
            if (!a.fezTodasAsProvas()) {
                a.exibirDados();
                encontrou = true;
            }
        }
        if (!encontrou)
            System.out.println("Nenhum aluno com provas pendentes!");
    }

    // Menu principal
    public void menu() {
        int opcao;
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Registrar nota");
            System.out.println("3. Listar todos os alunos");
            System.out.println("4. Ver alunos pendentes");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAluno();
                case 2 -> registrarNota();
                case 3 -> listarAlunos();
                case 4 -> verificarPendentes();
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}