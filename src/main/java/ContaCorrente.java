public class ContaCorrente {
     Cliente titular;
     private int numero;
     private double saldo;

    public ContaCorrente(Cliente titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;

    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular=" + titular +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
