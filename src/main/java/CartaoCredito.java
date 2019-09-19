public class CartaoCredito {
    private Cliente titular;
    private String numero;
    private double limite;
    private double fatura;

    public CartaoCredito(Cliente titular, String numero, double limite, double fatura) {
        this.titular = titular;
        this.numero = numero;
        this.limite = limite;
        this.fatura = fatura;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }
}
