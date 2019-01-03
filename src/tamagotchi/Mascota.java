/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi;

import java.util.ArrayList;

/**
 *
 * @author MonkeyBoy
 */
public class Mascota {
    private String nombre;
    private int energia=100;
    private int higiene=100;
    private int hambre=0;
    private boolean estado=false;
    
    public static ArrayList<Mascota> ListaMascota=new ArrayList<Mascota>();

    public Mascota() {
    }

    Mascota(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void Jugar (){
    if (estado== true){
        setEnergia(getEnergia()-5);
        setHigiene(getHigiene()-5);
        setHambre(getHambre()+5);
        if (getEnergia()<=0|| getHigiene ()<=0 || getHambre () >=100){
            System.out.println("Mascota Muerta");
            setEstado(false);
            
        }else {
            System.out.println("Mascota Viva");
            setEstado(true);
        }
    }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

    
