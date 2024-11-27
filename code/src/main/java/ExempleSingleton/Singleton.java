/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExempleSingleton;


/**
 *
 * @author tims
 */
public final class Singleton {
    private static Singleton instance = null;
    
    private int x;
    private int y;

    // Constructeur privé
    private Singleton() {}

    // Méthode statique pour obtenir l'instance unique de la classe avec initialisation facultative
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Méthode pour initialiser les valeurs x et y
    public void setValues(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int Somme(int x, int y) {
        return x + y;
    }

    public int Moyenne(int x, int y) {
        return Somme(x, y) / 2;
    }

    // Méthode d'affichage
    public void affiche() {
        System.out.println("\nJe suis une instance et mes valeurs sont : x = " + this.x + " et y = " + this.y);
    }

    // Empêche le clonage de l'instance
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

