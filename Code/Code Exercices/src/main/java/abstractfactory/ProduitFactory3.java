/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author tims
 */
public class ProduitFactory3 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA3();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB3();
    }
    
}
