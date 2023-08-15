/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Familiar
 */
public class Mago extends Personaje {
    String Hab1;
    
    public Mago (int Daño, String Nombre, int Defensa, int Vida){
        super (Daño, Nombre, Defensa, Vida);
    }
   
    
    public void Ataque(){
        System.out.println("Habilidad");
    }

    public String getHab() {
        return "Habilidad de la clase ejemplo";
    }
    
    @Override
    public void Habilidad1(){
        double multiplicador;

        multiplicador = 1.5;
    }
    
    @Override
    public void Habilidad2(){
        double multiplicador;
        
        multiplicador = 1.6;

    }
    public int Habilidad3(){
        return 20;
    }
    
}
