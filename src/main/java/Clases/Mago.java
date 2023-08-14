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
    
    public Mago (int Daño, String Nombre, int Defensa, int Vida, String tipo){
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
        boolean congelado = true;
        String Nom = "Ataque de hielo";
        multiplicador = 1.5;
        penetracion = 60;
        return new Object[] { multiplicador, penetracion, congelado, Nom};
    }
    
    public Object[] Habilidad2(){
        double multiplicador;
        int penetracion;
        String Nom = "Avada kedavra";
        multiplicador = 1.6;
        penetracion = 100;
        return new Object[] { multiplicador, penetracion, Nom };
    }
    public int Habilidad3(){
        return 20;
    }
    
}
