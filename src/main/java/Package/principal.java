package Package;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class principal {
     public static void main(String[] args) {
        Baraja b = new Baraja(1);
        b.desordenarBaraja();
        b.mostrar_baraja();
        b.ordenar_Paralelo();
        //b.ordenar_secuencial();
        b.mostrar_baraja();
    }
}
