/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_06;

import Java_1_06.Box;

/**
 *
 * @author Dmitry
 */
public class BoxDemo5 {
    public static void main(String[] args) {
        
        double vol;
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        mybox1.setDim(7,7,7);
        mybox2.setDim(3,3,3);

        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
