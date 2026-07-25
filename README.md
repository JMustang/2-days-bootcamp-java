# 2 days bootcamp java

Repositório com exercícios, exemplos e pequenos projetos usados durante um bootcamp de Java (2 dias). Ideal para estudar conceitos básicos e praticar POO, estruturas de controle, coleções e expressões lambda.

## Estrutura do repositório

- `game/` — exemplo simples de jogo (herói vs monstro).
- `JavaCore/` — exercícios e exemplos sobre fundamentos da linguagem.
- `CalcTools/` — exemplos de calculadora e utilitários.

## Objetivo

Praticar os conceitos fundamentais de Java e fornecer exemplos executáveis que ilustram:

- Sintaxe básica, tipos e variáveis
- Programação Orientada a Objetos (classes, herança, polimorfismo)
- Estruturas condicionais e laços
- Lambda e programação funcional básica

## Exemplos principais

- `game/Game.java` — exemplo de jogo para executar a interação entre `Heroi` e `Monstro`.
- `JavaCore/Main.java` — ponto de entrada com alguns exercícios de exemplo.

## Como compilar e executar

Recomenda-se compilar todos os arquivos e executar a classe que contém o método `main` desejado.

Compilar e executar apenas um exemplo (ex.: jogo):

```bash
mkdir -p out
javac -d out game/*.java
java -cp out Game
```

Compilar e executar o exemplo `JavaCore`:

```bash
mkdir -p out
javac -d out JavaCore/*.java
java -cp out Main
```

Compilar todo o projeto (modo geral):

```bash
mkdir -p out
find . -name "*.java" -print | xargs javac -d out
# Em seguida execute a classe com main (ex.: Main)
java -cp out Main
```

Observações:

- Se as classes estiverem declaradas dentro de `package`, chame o `java` usando o nome totalmente qualificado (ex.: `com.exemplo.App`).
- Ajuste o nome da classe passada ao `java` conforme a classe que possui o `main` que você quer executar.

## Contribuições

Este repositório é destinado ao estudo; sinta-se livre para adicionar exemplos, correções e melhorias.

---

Atualizado para incluir instruções de compilação e explique a estrutura do projeto.
