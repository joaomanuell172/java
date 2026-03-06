public class ContaBancaria {
  
    private String numeroConta;
    private String titular;
    private double saldo;

    
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

  
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação negada: Não é permitido depósito com valor negativo ou zero.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação negada: O valor de saque deve ser maior que zero.");
            return;
     
