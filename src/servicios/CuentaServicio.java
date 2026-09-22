package servicios;

import java.util.ArrayList;
import java.util.List;

import modelos.Cuenta;
import modelos.TipoCuenta;

public class CuentaServicio {

    private static String[] encabezados = { "Tipo", "Número", "Titular", "Parámetros",
            "Saldos" };

    private static List<Cuenta> cuentas = new ArrayList<>();

    public static String[] getEncabezados() {
        return encabezados;
    }

    public static Cuenta agregar(TipoCuenta tipo) {
        Cuenta cuenta = null;
        switch (tipo) {
            case AHORROS:

                break;
            case CORRIENTE:

                break;
            case CREDITO:

                break;
        }
        return cuenta;
    }

    public static String[][] getDatos() {
        String[][] datos = new String[cuentas.size()][encabezados.length];

        return datos;
    }

}
