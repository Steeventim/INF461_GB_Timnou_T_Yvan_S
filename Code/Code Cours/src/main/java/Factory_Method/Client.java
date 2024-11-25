/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Factory_Method;

/**
 * Classe client pour tester le pattern Factory Method
 * 
 * @author tims
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("Bonjour le monde");
        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;

        // Produit de type A
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        if (produit != null) {
            produit.methodeproduit();
        }

        // Produit de type B
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        if (produit != null) {
            produit.methodeproduit();
        }

        // Produit de type C
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        if (produit != null) {
            produit.methodeproduit();
        }

        // Produit inexistant (type D)
        produit = fabriqueproduit.createProduit("D");
        if (produit != null) {
            produit.methodeproduit();
        } else {
            System.out.println("Impossible de créer le produit de type D");
        }
    }
}

