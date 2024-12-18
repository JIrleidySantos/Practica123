/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicas.clases;

/**
 *
 * @author mundo
 */
public class Cuenta {

    protected float saldo;
    protected int nConsignaciones = 0;
    protected int nRetiros = 0;
    protected float tasaAnual;
    protected float comiMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getnConsignaciones() {
        return nConsignaciones;
    }

    public void setnConsignaciones(int nConsignaciones) {
        this.nConsignaciones = nConsignaciones;
    }

    public int getnRetiros() {
        return nRetiros;
    }

    public void setnRetiros(int nRetiros) {
        this.nRetiros = nRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComiMensual() {
        return comiMensual;
    }

    public void setComiMensual(float comiMensual) {
        this.comiMensual = comiMensual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", nConsignaciones=" + nConsignaciones + ", nRetiros=" + nRetiros + ", tasaAnual=" + tasaAnual + ", comiMensual=" + comiMensual + '}';
    }

    public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            nConsignaciones++;
        }
    
    
    public boolean retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            nRetiros++;
            return true;
        }
        return false;
    }

    public void calcularInteresMensual() {
        float interesMensual = (tasaAnual / 12) / 100;
        saldo = saldo + (saldo * interesMensual);
    }

    public void extractoMensual() {
        saldo = saldo - comiMensual;
        calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + nConsignaciones);
        System.out.println("Número de retiros: " + nRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + comiMensual);
    }

}
