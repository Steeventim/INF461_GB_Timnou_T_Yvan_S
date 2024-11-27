/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author tims
 */
public final class Singleton {
    public static Singleton instance =null;
    
    private 
            String attribut1;
            int attribute2;
            
            Singleton(){
            super();
            }
// Méthode statique pour obtenir l'instance unique de la classe 
public static Singleton getInstance() { 
    if (instance == null) { 
// Création de l'instance si elle n'existe pas encore 
    instance = new Singleton(); 
    } 
    return instance; 
}

// D'autres methodes classiques et non "static"
public void op1(int x, int y, int z){
    this.attribut1 = "Bonjour";
}

public void op2(int x, int y, int z){}
    
}
