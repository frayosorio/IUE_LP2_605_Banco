package modelos;

public class Ahorros extends Cuenta {

    private double tasa;

    public Ahorros(String titular, String numero, double tasa) {
        // llamado al método constructor de la clase PADRE
        super(titular, numero);
        this.tasa = tasa;
    }

    public double getTasa() {
        return tasa;
    }

    public void abonarIntereses() {
        setSaldo(getSaldo() * (1 + tasa / 100));
    }

    @Override
    public boolean retirar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

}
