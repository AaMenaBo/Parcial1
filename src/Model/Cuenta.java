/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.logging.Logger;

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
    private boolean primerLogin;

    public double getFondosReales() {
        return fondosReales;
    }

    public boolean isPrimerLogin() {
        return primerLogin;
    }
    
    public void setPrimerLogin(boolean primerLogin) {
        this.primerLogin = primerLogin;
    }   

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
        fondosReales += saldo;
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
        if (verificarPassword(password)) {
            this.password = password;
        }
    }

    private boolean verificarPassword(String password) {
        // Al menos una mayúscula y una minúscula
        if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
            return false;
        }

        // Al menos 4 números
        if (!password.matches(".*\\d{4,}.*")) {
            return false;
        }

        // Los números y letras no deben ser consecutivos
        if (password.matches(".*[a-zA-Z0-9]{3,}.*")) {
            return false;
        }

        // El tamaño total de la contraseña debe ser al menos de 8 caracteres
        if (password.length() < 8) {
            return false;
        }

        return true;
    }
}
