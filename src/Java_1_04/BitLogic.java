/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_04;

/**
 *
 * @author Dmitry
 */
public class BitLogic {
    public static void main(String[] args) {
        String binary[] = {
                "0000","0001","0010","0011","0100","0101","0110","0111",
                "1000","1001","1010","1011","1100","1101","1110","1111"
                };
        
        int a = 3;
        int b = 6;
        int c = a|b;
        int d = a&b;
        int e = a^b;
        int f = (~a&b)|(a&~b);
        int g = ~a&0x0f;
  
        System.out.println("a           = " + a);
        System.out.println("b           = " + b);
        System.out.println("a|b         = " + c);
        System.out.println("a&b         = " + d);
        System.out.println("a^b         = " + e);
        System.out.println("~a&b|a&~b   = " + f);
        
        System.out.println("\na           = " + binary[a]);
        System.out.println("b           = " + binary[b]);
        System.out.println("a|b         = " + binary[c]);
        System.out.println("a&b         = " + binary[d]);
        System.out.println("a^b         = " + binary[e]);
        System.out.println("~a&b|a&~b   = " + binary[f]);
        System.out.println("~a&0x0f     = " + binary[g]);
              
    }
}
