/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.adapter;

/**
 *
 * @author Kuba
 */
public class Adapter implements Utils.CircleR{
    private double r;

 public Adapter(CircleD circleD){
 r = circleD.getD()/2;
 }

 @Override
 public double getR() { return r; }
}
