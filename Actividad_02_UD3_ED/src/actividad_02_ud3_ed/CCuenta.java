/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * @author Ana
 * @author jherram0603
 * @version 1.1 12/13/2022
 * @since 1.0
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta()
    {
    }
   /**
    * Parametros del objeto Cuenta
    * @param nom Nombre del titular de la cuenta
    * @param cue Nombre de la cuenta del titular de esta
    * @param sal Saldo del titular de la cuenta
    * @param tipo Tipo de interes del titular de la cuenta
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }

    /**
     *
     * @param nom Asigna el nombre del titular de la cuenta
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * @return Nombre del titular de la cuenta
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     *
     * @return Saldo actual de la cuenta
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     *
     * @param cantidad Cantidad de dinero que se le ingresara al saldo de la cuenta
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad Cantidad de dinero que se retirara del saldo de la cuenta
     * @throws Exception
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * @return El nombre de la cuenta del titular
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     * @param cuenta Establece el nombre de la cuenta para su titular
     */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
     * @param saldo Saldo que establecer al titular de la cuenta
     */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

    /**
     * @return Tipo actual del interes del titular
     */
 
  public double getTipoInterés() {
    return tipoInterés;
  }

    /**
     * @param tipoInterés Tipo de interes que establecer al titular de la cuenta
     */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
