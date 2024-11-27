/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExempleBuilder;

import Builder.*;

/**
 *
 * @author tims
 */
public class Directeur {
    public Pizza construirePizzaPiquante(){
        MonteurPizza pizzap = new MonteurPizzaPiquante();
        return pizzap.getPizza();
    }
    public Pizza construirePizzaReine(){
        MonteurPizza pizzareine = new MonteurPizzaReine();
        return pizzareine.getPizza();
    }
    public Pizza construirePizzaFromage(){
        MonteurPizza pizzafromage = new MonteurPizzaFromage();
        return pizzafromage.getPizza();
    }
    
}
