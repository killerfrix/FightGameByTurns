/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Familiar
 */
public class Hada extends Personaje{
    String Hab1;
    
    public Hada (int Daño, String Nombre, int Defensa, int Vida, int tipo){
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
        String Nom = "Polvos Magicos";
        multiplicador = 1.1;
        penetracion = 90;
        return new Object[] { multiplicador, penetracion, Nom };
    }
    
    public Object[] Habilidad2(){
        double multiplicador;
        int penetracion;
        String Nom = "Espiritu de la naturaleza";
        multiplicador = 1.5;
        penetracion = 60;
        return new Object[] { multiplicador, penetracion, Nom };
    }
    public int Habilidad3(){
        return 15;
    }
}
