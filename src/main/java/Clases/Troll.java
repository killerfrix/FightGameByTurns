/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Familiar
 */
public class Troll  extends Personaje {
    String Hab1;
    
    public Troll (int Daño, String Nombre, int Defensa, int Vida, String tipo){
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
        String Nom = "Pisoton";
        multiplicador = 3;
        penetracion = 20;
        return new Object[] { multiplicador, penetracion, Nom};
    }
    
    public Object[] Habilidad2(){
        double multiplicador;
        int penetracion;
        String Nom = "Golpe Cargado";
        multiplicador = 2.4;
        penetracion = 20;
        return new Object[] { multiplicador, penetracion, Nom };
    }
    public int Habilidad3(){
        return 20;
    }
}
