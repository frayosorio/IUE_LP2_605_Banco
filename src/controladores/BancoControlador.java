package controladores;

import vistas.BancoVista;
import modelos.TipoCuenta;
import servicios.CuentaServicio;

public class BancoControlador {

    private BancoVista vista;

    public BancoControlador(BancoVista vista) {
        this.vista = vista;
        mostrarCuentas();
        this.vista.setGuardarCuentaClick(evento -> agregarCuenta());
    }

    private void mostrarCuentas() {
        vista.mostrarCuentas(CuentaServicio.getDatos(), CuentaServicio.getEncabezados());
    }

    private void agregarCuenta() {
        var tipo = vista.getTipoCuentaSeleccionado();
        var titular = vista.getTitular();
        var numero = vista.getNumero();
        var tasa = tipo == TipoCuenta.AHORROS || tipo == TipoCuenta.CREDITO ? vista.getTasa() : 0;
        var sobregiro = tipo == TipoCuenta.CORRIENTE ? vista.getValor() : 0;
        var valorPrestado = tipo == TipoCuenta.CREDITO ? vista.getValor() : 0;
        var plazo = tipo == TipoCuenta.CREDITO ? vista.getPlazo() : 0;

        CuentaServicio.agregar(tipo, titular, numero, tasa, sobregiro, valorPrestado, plazo);

        mostrarCuentas();

        vista.ocultarEdicionCuenta();
    }

}
