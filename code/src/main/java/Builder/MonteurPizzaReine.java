/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author tims
 */
public class MonteurPizzaReine extends MonteurPizza {

    @Override
    public void monterPate(){
        pizza.setPate("croisee");
    }
    @Override
    public void monterSauce(){
        pizza.setSauce("douce");
    }
    @Override
    public void monterGarniture(){
        pizza.setGarniture("jambon+champignon");
    }
    
}
