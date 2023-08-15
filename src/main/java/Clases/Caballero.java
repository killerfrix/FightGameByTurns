/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Ventanas.PVPFrame;

/**
 *
 * @author Familiar
 */
public class Caballero extends Personaje {
    
    public Caballero (int Daño, String Nombre, int Defensa, int Vida, boolean EstadoDefensa){
        super (Daño, Nombre, Defensa, Vida, EstadoDefensa);
    }
    
    @Override 
    public void Ataque(){
        int vidaMago = Ventanas.Menu.Wizard.get(0).getVida();
        int dañoCaballero = Ventanas.Menu.Knight.get(0).getDaño();
        int Resultado = vidaMago - dañoCaballero;
        
        Mago Wizard = Ventanas.Menu.Wizard.get(0);
        Wizard.setVida(Resultado);
    }

    @Override
    public void Habilidad1(){
        double multiplicador = 1.4;
        double  vidaMago = Ventanas.Menu.Wizard.get(0).getVida();
        double  dañoCaballero = Ventanas.Menu.Knight.get(0).getDaño();
        double  Resultado = vidaMago - (dañoCaballero*multiplicador);
        
        Mago Wizard = Ventanas.Menu.Wizard.get(0);
        Wizard.setVida((int) Resultado);
    }
    
    @Override
    public void Habilidad2(){
        double multiplicador;
        multiplicador = 2;
        double  vidaMago = Ventanas.Menu.Wizard.get(0).getVida();
        double  dañoCaballero = Ventanas.Menu.Knight.get(0).getDaño();
        double  Resultado = vidaMago - (dañoCaballero*multiplicador);
        
        Mago Wizard = Ventanas.Menu.Wizard.get(0);
        Wizard.setVida((int) Resultado);
    }
}
