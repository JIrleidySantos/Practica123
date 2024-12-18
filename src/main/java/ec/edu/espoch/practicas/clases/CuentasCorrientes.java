/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicas.clases;

/**
 *
 * @author SO-LAB1-PC24
 */
public class CuentasCorrientes extends Cuenta {

    private float sobregiro;

    public CuentasCorrientes(float sobregiro, float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public boolean retirar(float cantidad) {
        if (cantidad > saldo) {
            sobregiro = sobregiro+(cantidad - saldo);
            saldo = 0;
        } else {
            saldo = saldo - cantidad;
        }
        int nRetiros = 0;
        nRetiros++;
        return true;
    }
    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad= cantidad -sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
                cantidad = 0;
            }
        }
        saldo += cantidad;
        int numeroConsignaciones = 0;
        numeroConsignaciones++;
    }
    @Override
      public void imprimir() {
        super.imprimir();
        System.out.println("el Sobregiro es: " + sobregiro);
    }
}
