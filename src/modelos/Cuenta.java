package modelos;

// No se pueden crear instancias de clases ABSTRACTAS
public abstract class Cuenta {

    private String titular;
    private double saldo;
    private String numero;

    // metodo constructor
    public Cuenta(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    // metodo que pueden acceder las clases HIJAs
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // metodo que define funcionalidad para ser implementada por las clases HIJAs
    // por lo tanto, no tienen cuerpo
    public abstract boolean retirar(double valor);

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

}
