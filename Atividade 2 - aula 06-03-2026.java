public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", 180);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual());

        carro.acelerar(50);
        System.out.println("Depois de acelerar: " + carro.getVelocidadeAtual());

        carro.frear(30);
        System.out.println("Depois de frear: " + carro.getVelocidadeAtual());
    }
}

class Carro {

    private String marca;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(String marca, int velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = Math.max(0, velocidadeMaxima);
        this.velocidadeAtual = 0;
    }

    public void acelerar(int valor) {
        if (valor <= 0) return;

        velocidadeAtual += valor;

        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public void frear(int valor) {
        if (valor <= 0) return;

        velocidadeAtual -= valor;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }
}
