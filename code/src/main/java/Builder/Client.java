/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Builder;

import Singleton.*;
import abstractfactory.*;

/**
 *
 * @author tims
 */
public class Client {

    public static void main(String[] args) {
        Directeur directeur = new Directeur();
        // construire pizza reine
        System.out.println("------------------------Pizza Reine Fabriquee--------------------");
        directeur.construirePizzaReine().print();
        // construire pizza Piquante
        System.out.println("------------------------Pizza Piquante Fabriquee--------------------");
        directeur.construirePizzaPiquante().print();
    }
}
