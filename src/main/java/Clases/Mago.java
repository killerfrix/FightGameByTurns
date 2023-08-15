/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Ventanas.Menu;

/**
 *
 * @author Familiar
 */
public class Mago extends Personaje {
    String Hab1;
    
    public Mago (int Daño, String Nombre, int Defensa, int Vida, boolean EstadoDefensa){
        super (Daño, Nombre, Defensa, Vida, EstadoDefensa);
    }
   
    
    @Override
    public void Ataque(){
        Caballero Knight = Ventanas.Menu.Knight.get(0);
        
        if(Menu.Knight.get(0).getEstadoDefensa() == false){
            int vidaCaballero = Ventanas.Menu.Knight.get(0).getVida();
            int dañoMago = Ventanas.Menu.Wizard.get(0).getDaño();
            int Resultado = vidaCaballero - dañoMago;
        
            Knight.setVida(Resultado);
        }
        else if(Menu.Knight.get(0).getEstadoDefensa() == true){      
            if(Menu.Knight.get(0).getDefensa() > 0){
                int EscudoCaballero = Ventanas.Menu.Knight.get(0).getDefensa();
                int dañoMago = Ventanas.Menu.Wizard.get(0).getDaño();
                int Resultado2 = EscudoCaballero - dañoMago;

                Knight.setDefensa(Resultado2);
            }
            else if(Menu.Knight.get(0).getDefensa() <= 0){
                Knight.setEstadoDefensa(false);
            }   
        }     
    }

    @Override
    public void Habilidad1(){
        double multiplicador = 1.4;
        
        Caballero Knight = Ventanas.Menu.Knight.get(0);
        
        if(Menu.Knight.get(0).getEstadoDefensa() == false){
            double  vidaCaballero = Ventanas.Menu.Knight.get(0).getVida();
            double  dañoMago = Ventanas.Menu.Wizard.get(0).getDaño();
            double  Resultado = vidaCaballero - (dañoMago*multiplicador);
        
            Knight.setVida((int) Resultado);
        }
        
        else if(Menu.Knight.get(0).getEstadoDefensa() == true){      
            if(Menu.Knight.get(0).getDefensa() > 0){
                double EscudoCaballero = Ventanas.Menu.Knight.get(0).getDefensa();
                double dañoMago = Ventanas.Menu.Wizard.get(0).getDaño();
                double Resultado2 = EscudoCaballero - (dañoMago*multiplicador);

                Knight.setDefensa((int) Resultado2);
            }
            else if(Menu.Knight.get(0).getDefensa() <= 0){
                Knight.setEstadoDefensa(false);
            }   
        }     
    }
    
    @Override
    public void Habilidad2(){
        double multiplicador = 2;
        
        Caballero Knight = Ventanas.Menu.Knight.get(0);
        
        if(Menu.Knight.get(0).getEstadoDefensa() == false){
            double  vidaCaballero = Ventanas.Menu.Knight.get(0).getVida();
            double  dañoMago = Ventanas.Menu.Wizard.get(0).getDaño();
            double  Resultado = vidaCaballero - (dañoMago*multiplicador);
        
            Knight.setVida((int) Resultado);
        }
        
        else if(Menu.Knight.get(0).getEstadoDefensa() == true){      
            if(Menu.Knight.get(0).getDefensa() > 0){
                double EscudoCaballero = Ventanas.Menu.Knight.get(0).getDefensa();
                double dañoMago = Ventanas.Menu.Wizard.get(0).getDaño();
                double Resultado2 = EscudoCaballero - (dañoMago*multiplicador);

                Knight.setDefensa((int) Resultado2);
            }
            else if(Menu.Knight.get(0).getDefensa() <= 0){
                Knight.setEstadoDefensa(false);
            }   
        }   
    }
    
}
