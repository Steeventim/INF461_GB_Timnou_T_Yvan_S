/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author tims
 */
public class Pizza {
    private String pate = "";
            String sauce="";
            String garniture ="";

    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }
    
    public void print() {
        System.out.println("Base : " + this.pate);
        System.out.println("Sauce : " + sauce);
        System.out.println("Garnitures : " + garniture);
    }

    
            
    
    
}
