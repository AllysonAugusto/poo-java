package Conta_Bancária;

public class Conta {
    // Atributos da conta bancária
    private String titular; // Nome do titular da conta
    private int numero;     // Número da conta (atribuído automaticamente)
    private double saldo;   // Saldo da conta
    private static int totalContas = 0; // Contador para gerar números de conta únicos
    
     // Construtor da classe Conta
    public void Conta(String titular){
        this.titular = titular;
        this.numero = ++totalContas; // Atribui um número de conta único automaticamente
        this.saldo = 0.0; // Inicializa o saldo como zero
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor; // Adiciona o valor ao saldo
            System.out.println("Depósito de " + valor + " realizado na conta " + numero);
        } else {
            System.out.println("Valor de depósito é inválido.");
        }
    }

    // Método estático para realizar um depósito em uma conta específica
    public static void depositarEmConta(Conta c, double valor) {
        c.depositar(valor); // Chama o método depositar da instância de Conta 'c'
    }
    
    // Método para realizar um saque na conta atual
    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta " + numero);
            return true;
        } else {
            System.out.println("Saldo insuficiente para efetuar o saque ou valor de saque inválido.");
            return false;
        }
    }

    // Método para realizar uma transferência para outra conta
    public boolean transfere(Conta c, double valor){ 
        if (sacar(valor)){ // Se o saque for bem-sucedido, a transferência ocorrerá
            c.depositar(valor); // Realiza depósito na conta 'c'
            System.out.println("Transferência de R$ " + valor + " na conta " + numero + " para a conta " + c.numero + " realizada.");
            return true;
        } else {
            System.out.println("Erro: Transferência não realizada.");
            return false;
        }
    }
    
    // Método para obter uma representação em string da conta
    public String toString(){
        return String.format("Nº da conta: %d, Titular: %s, Saldo: %.2f", numero, titular, saldo);
    }
    
    // Método para obter o saldo da conta atual
    public double getSaldo(){
        return saldo;
    }
}







    
    


