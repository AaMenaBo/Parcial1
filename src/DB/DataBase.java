/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import Model.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author menab
 */
public class DataBase {
    private static ArrayList<Cuenta> cuentas;

    public static ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    public static void Start(){
        cuentas = new ArrayList<>();
        cuentas.add(new Cuenta("Lily Abril Álvarez Rodríguez","1234123412341234",1234));
        cuentas.add(new Cuenta("Fabián Ruiz Pérez",           "2222222222222222",1234));
        cuentas.add(new Cuenta("Ana Michelle Coxca Rodríguez","0274287576610047",1234));
        cuentas.add(new Cuenta("Juan Emilio Bravo Rojas",     "9910311002088923",1234));
        cuentas.add(new Cuenta("María Elsa García García",    "2098678294623873",1234));
        
    }    
}
