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
public class MonteurPizzaFromage extends MonteurPizza {

    @Override
    public void monterPate(){
        pizza.setPate("Epaisse");
    }
    @Override
    public void monterSauce(){
        pizza.setSauce("Crème");
    }
    @Override
    public void monterGarniture(){
        pizza.setGarniture("Mozzarella, Parmesan, Roquefort");
    }
    
}
