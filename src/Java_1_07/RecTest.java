/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

/**
 *
 * @author Dmitry
 */
public class RecTest {
    int values[];
    public RecTest(int i) {
        this.values = new int[i];
    }
    public void printArray(int i){
        if(i==0)return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
