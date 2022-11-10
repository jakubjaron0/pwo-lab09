/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.composite;

/**
 *
 * @author Kuba
 */
public class Tank extends WaterSystem {

    boolean full = false;

    public void fill() {
        super.fill();
        System.out.println("Zamykam odpływ");
    }

    public void afterFill() {
        super.afterFill();
        full = true;
    }

    public void drain() {
        super.drain();
        System.out.println("Otwieram odpływ");
    }

    public void afterDrain() {
        super.afterDrain();
        full = false;
    }

}
