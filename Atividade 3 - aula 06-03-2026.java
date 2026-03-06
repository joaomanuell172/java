public class Aluno {
    
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = Math.max(0, Math.min(10, nota));
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public double calcularMedia() {
        return nota; // Para simplificar, a média é a própria nota
    }

    public boolean isAprovado() {
        return calcularMedia() >= 6.0;
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        Aluno[] alunos = new Aluno[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\nAluno " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            alunos[i] = new Aluno(nome, nota);
        }

        System.out.println("\n--- RESULTADOS ---");

        for (Aluno aluno : alunos) {

            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("Status: " + (aluno.isAprovado() ? "Aprovado" : "Reprovado"));
            System.out.println();
        }

        scanner.close();
    }
}
