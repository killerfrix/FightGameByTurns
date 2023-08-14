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
    
    public Caballero (int Daño, String Nombre, int Defensa, int Vida, int tipo){
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
        String Nom = "Maza giratoria";
        multiplicador = 2;
        penetracion = 30;
        return new Object[] { multiplicador, penetracion, Nom};
    }
    
    public Object[] Habilidad2(){
        double multiplicador;
        int penetracion;
        String Nom = "Alabarda cargado";
        multiplicador = 1.4;
        penetracion = 70;
        return new Object[] { multiplicador, penetracion, Nom };
    }
    public int Habilidad3(){
        return 20;
    }
}
