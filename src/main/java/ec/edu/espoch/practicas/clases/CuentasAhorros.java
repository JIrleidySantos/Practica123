/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicas.clases;

/**
 *
 * @author USUARIO
 */
public class CuentasAhorros extends Cuenta {

    private boolean cuentaActiva;

    public CuentasAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.cuentaActiva = saldo >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (cuentaActiva) {
            super.consignar(cantidad);
        }
        verificarEstadoCuenta();
    }

    @Override
    public boolean retirar(float cantidad) {
        if (cuentaActiva && super.retirar(cantidad)) {
            verificarEstadoCuenta();
            return true;
        }
        return false;
    }

    @Override
    public void extractoMensual() {
        if (nRetiros > 4) {
            comiMensual += (nRetiros - 4) * 1000;
        }
        super.extractoMensual();
        verificarEstadoCuenta();
    }

    private void verificarEstadoCuenta() {
        cuentaActiva = saldo >= 10000;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta activa: " + cuentaActiva);
    }

}
