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
public class MonteurPizzaPiquante extends MonteurPizza {

    @Override
    public void monterPate(){
        pizza.setPate("feuillete");
    }
    @Override
    public void monterSauce(){
        pizza.setSauce("piquante");
    }
    @Override
    public void monterGarniture(){
        pizza.setGarniture("pepperoni+salami");
    }
    }
    

