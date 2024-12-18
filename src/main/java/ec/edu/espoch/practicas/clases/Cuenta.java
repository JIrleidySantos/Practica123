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
        protected int nConsignaciones=0;
        protected int nRetiros=0;
        protected float tasaAnual;
        protected float comiMensual=0;

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

}
