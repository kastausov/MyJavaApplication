/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyShell;

/**
 *
 * @author Dmitry
 */
public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000;
        int i = iOb.byteValue();
        System.out.println(i);
    }
}
