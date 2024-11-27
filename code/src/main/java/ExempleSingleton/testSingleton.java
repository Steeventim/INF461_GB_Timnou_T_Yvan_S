/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ExempleSingleton;


/**
 *
 * @author tims
 */
public class testSingleton {
    public static void main(String[] args) {
        // Utilisation de la méthode Somme de l'instance Singleton
        int som = Singleton.getInstance().Somme(2, 5);
        System.out.println("La somme est : " + som);

        // Configuration des valeurs pour l'instance Singleton et affichage
        Singleton s1 = Singleton.getInstance();
        s1.setValues(8, 3);
        s1.affiche();
        
        // Tentative de configurer de nouvelles valeurs
        Singleton s2 = Singleton.getInstance();
        s2.setValues(16, 19);
        s2.affiche();
    }
}

