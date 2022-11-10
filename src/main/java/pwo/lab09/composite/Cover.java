/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.composite;

/**
 *
 * @author Kuba
 */
public class Cover extends WaterSystem {
     boolean full = false;
    public void fill() {
        super.fill();
        System.out.println("Otwieram pokrywe");
    }
 
    
public void afterFill() {
 super.afterFill();
 System.out.println("Zamykam pokrywe");
 full = true;
 }
    

   
}
