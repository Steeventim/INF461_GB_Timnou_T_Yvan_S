/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Singleton;

/**
 *
 * @author tims
 */
public class testSingleton {

    public static void main(String[] args) {
        Singleton.getInstance().op1(1, 2, 3);
        Singleton.getInstance().op2(3, 4, 5);
        
//        Singleton singl = new Singleton.getInstance();
//        singl.op1(1, 2, 3);
//        singl.op1(3, 4, 5);
    }
}
