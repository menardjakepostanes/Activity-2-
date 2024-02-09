/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity.pkg2;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author MenardJakeP
 */
public class Activity2 {

    public static void main(String[] args) {
        
        int [] Elements = {50,40,30,20,10};
        
        
        System.out.println("The 5 Elements are : " + Arrays.toString(Elements));
        
                
        int sum = IntStream.of(Elements).sum();
        
        System.out.println("The sum is :" + sum);
        
        int max1 = Math.max(Elements [0], Math.max(Elements [1], Math.max(Elements [2],
                Math.max(Elements [3],Elements [4]))));
                
        System.out.println("Maximum Value: " + max1 );
        
        
                
                
                
                // TODO code application logic here
                }
    /**
     * @param args the command line arguments
     */
    
}
