/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Method;

/**
 *
 * @author tims
 */
public class FabriqueProduit {
    // Déclaration des types de produits
    public static final String typeA = "A";
    public static final String typeB = "B";
    public static final String typeC = "C";

    // Méthode de création de produits
    public Produit createProduit(String type) {
        Produit produit=null;
    
        switch (type) {
            case typeA:
                produit= new ProduitA();
                break;
            case typeB:
                produit= new ProduitB();
                break;
            case typeC:
                produit= new ProduitC();
                break;
            default:
                System.out.println("Type de produit non reconnu : " + type);
        }
                return produit;
    }
}
