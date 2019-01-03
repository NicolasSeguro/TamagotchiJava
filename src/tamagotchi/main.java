/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi;

import java.util.Scanner;

/**
 *
 * @author MonkeyBoy
 */
public class main {

    /**
     * 
     */
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
    String nombre = "";
    int op = 0;
    Mascota m = new Mascota ();
    
    do {
        System.out.println("1. Registrar mascota \n 2.Jugar 3.Descansar \n 4.Salir");
        op = Integer.parseInt(s.nextLine());
        switch (op){
            case 1 :
                System.out.println("Ingrese Mascota");
                nombre = s.nextLine();
                Mascota mn = new Mascota(nombre);
                Mascota.ListaMascota.add(mn);
                System.out.println("La mascota" + mn.getNombre() + "fue registrada con exito.");
                break;
                
            case 2:
                System.out.println("Mascota jugando");
                m.Jugar();
                System.out.println("Energia"+ m.getEnergia());
                System.out.println("Higiene"+ m.getHigiene());
                System.out.println("Hambre"+ m.getHambre());
                break;
                
            default: System.out.println("Programa cerrado,gracias por tu visita");
                
                
        }
        
    } while(op !=4);
        
    }
    
}
