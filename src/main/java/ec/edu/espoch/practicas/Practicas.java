/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.practicas;

import ec.edu.espoch.practicas.clases.CuentaCorrientes;
import ec.edu.espoch.practicas.clases.CuentasAhorros;

/**
 *
 * @author mundo
 */
public class Practicas {

    public static void main(String[] args) {
        // Crear una cuenta de ahorros
        CuentasAhorros cuentaAhorros = new CuentasAhorros(15000, 3.5f);

        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(3000);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        System.out.println("\n");

        // Crear una cuenta corriente
        CuentaCorrientes cuentaCorriente = new CuentaCorrientes(5000, 4.0f);

        cuentaCorriente.retirar(6000);
        cuentaCorriente.consignar(2000);
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();
    }
}
