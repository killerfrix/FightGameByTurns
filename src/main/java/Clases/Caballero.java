/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Familiar
 */
public class Caballero extends Personaje {
    String Hab1;
    
    public Caballero (int Daño, String Nombre, int Defensa, int Vida, String tipo){
        super (Daño, Nombre, Defensa, Vida, tipo);
    }
   
    
    public void Ataque(){
        System.out.println("Habilidad");
    }

    public String getHab() {
        return "Habilidad de la clase ejemplo";
    }
    
    public Object[] Habilidad1(){
        double multiplicador;
        int penetracion;
        multiplicador = 1.60;
        penetracion = 60;
        return new Object[] { multiplicador, penetracion };
    }
    
    public Object[] Habilidad2(){
        double multiplicador;
        int penetracion;
        multiplicador = 2;
        penetracion = 80;
        return new Object[] { multiplicador, penetracion };
    }
    public int Habilidad3(){
        return 20;
    }
}
