/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Familiar
 */
public class Guerrero_Azteca extends Personaje {
    String Hab1;
    
    public Guerrero_Azteca (int Daño, String Nombre, int Defensa, int Vida, String tipo){
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
        String Nom = "Atlatl";
        multiplicador = 1.4;
        penetracion = 90;
        return new Object[] { multiplicador, penetracion, Nom};
    }
    
    public Object[] Habilidad2(){
        double multiplicador;
        int penetracion;
        String Nom = "Barrida de Macahuitl";
        multiplicador = 2.8;
        penetracion = 20;
        return new Object[] { multiplicador, penetracion, Nom };
    }
    public int Habilidad3(){
        return 10;
    }
}
