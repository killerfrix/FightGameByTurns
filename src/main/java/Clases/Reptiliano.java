/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Familiar
 */
public class Reptiliano  extends Personaje {
    String Hab1;
    
    public Reptiliano (int Daño, String Nombre, int Defensa, int Vida, String tipo){
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
        String Nom = "Cola giratoria";
        multiplicador = 1.60;
        penetracion = 40;
        return new Object[] { multiplicador, penetracion, Nom};
    }
    
    public Object[] Habilidad2(){
        double multiplicador;
        int penetracion;
        String Nom = "Escamas venenosas";
        boolean veneno = true;
        multiplicador = 1;
        penetracion = 30;
        return new Object[] { multiplicador, penetracion, veneno, Nom };
    }
    public int Habilidad3(){
        return 20;
    }
}
