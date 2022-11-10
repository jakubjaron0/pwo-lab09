/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.composite;

/**
 *
 * @author Kuba
 */
public class Tap extends WaterSystem {
   public void fill() {
    super.fill();
    System.out.println("Kran odkręcony");
 }
   
   public void afterFill() {
 super.afterFill();
 System.out.println("Kran zakręcony");
 }
   
   public void afterDrain() {
 super.afterDrain();
 }

}
