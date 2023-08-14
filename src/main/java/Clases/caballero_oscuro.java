/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Familiar
 */
public class caballero_oscuro  extends Personaje {
    String Hab1;
    
    public caballero_oscuro (int Daño, String Nombre, int Defensa, int Vida, int tipo){
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
        String Nom = "Ataque Cargado";
        multiplicador = 1.7;
        penetracion = 80;
        return new Object[] { multiplicador, penetracion, Nom};
    }
    
    public Object[] Habilidad2(){
        double multiplicador;
        int penetracion;
        String Nom = "Roba alma";
        multiplicador = 1.5;
        penetracion = 100;
        return new Object[] { multiplicador, penetracion, Nom };
    }
    public int Habilidad3(){
        return 20;
    }
}
