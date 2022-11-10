/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.adapter;

/**
 *
 * @author Kuba
 */
public class Utils {
    
    public interface CircleR{
        double getR();
 }

 public static double circAreaR(CircleR circle){
    return Math.PI*Math.pow(circle.getR(), 2);
 }

}
