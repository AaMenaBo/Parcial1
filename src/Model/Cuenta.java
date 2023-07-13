/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author menab
 */
public class Cuenta {
    private String titular;
    private int numero;
    private int pin;
    private double fondosReales;
    private double saldo;
    private String password;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void sumarfondos() {
        fondosReales +=  saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }
    
    public void retirar(double saldo) {
        if (this.fondosReales - saldo >= 0) {
            this.fondosReales -= saldo;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        verificarPassword(password);
    }

    private void verificarPassword(String password) {
//        Al menos una mayúscula y una minúscula.
//        Al menos contenga 4 números.
//        Que los números y letras no sean consecutivos.
//        El tamaño total de la contraseña al menos deberá ser de 8 caracteres
    }
}