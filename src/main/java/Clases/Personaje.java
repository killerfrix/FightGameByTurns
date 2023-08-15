/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Familiar
 */
public abstract class Personaje {
    private int Daño;
    private String Nombre;
    private int Defensa;
    private int Vida;
    
    
    
    public Personaje (int Dam, String Nom, int Def, int vid){
        this.Daño = Dam;
        this.Nombre = Nom;
        this.Defensa = Def;
        this.Vida = vid;
    }
    
    
    public abstract void Ataque();
    public abstract void Habilidad1();
    public abstract void Habilidad2();
    

    public int getDaño() {
        return Daño;
    }

    public void setDaño(int Daño) {
        this.Daño = Daño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }
    
}
