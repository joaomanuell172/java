public class Main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario("Ana Paula", 30, 5000.0);
        Cliente cli = new Cliente("Roberto Silva", 45, "10/01/2023");

        Pessoa p1 = func;
        Pessoa p2 = cli;

        System.out.println("--- Dados do Funcionário ---");
        p1.exibirDados(); 

        System.out.println("\n--- Dados do Cliente ---");
        p2.exibirDados(); 
    }
}
public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade); 
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirDadosCompletos() {
        super.exibirDados(); 
        System.out.println("Cargo: " + this.cargo);
        System.out.printf("Salário: R$ %.2f\n", this.salario);
    }
}
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
    }
}

class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: R$ " + this.salario);
    }
}

class Cliente extends Pessoa {
    private String dataCadastro;

    public Cliente(String nome, int idade, String dataCadastro) {
        super(nome, idade);
        this.dataCadastro = dataCadastro;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Data de Cadastro: " + this.dataCadastro);
    }
}


public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void exibirDados() {
        System.out.println("--- Dados da Pessoa ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
    }
}
