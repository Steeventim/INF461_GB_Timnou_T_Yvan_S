/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExempleBuilder;


/**
 *
 * @author tims
 */
public abstract class MonteurPizza {
    protected Pizza pizza = new Pizza();
    
    public  Pizza getPizza(){
        monterPate();
        monterSauce();
        monterGarniture();
        return pizza;
    }
    
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}
