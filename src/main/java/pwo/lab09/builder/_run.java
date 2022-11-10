/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.builder;
import java.util.Scanner;
/**
 *
 * @author Kuba
 */
public class _run {

    public static void main(String[] args) {
       
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Podaj nazwe:");
        String name = scann.nextLine();
        
        System.out.println("Podaj background:");
        char background = scann.next().charAt(0);
        
        System.out.println("Podaj foreground:");
        char foreground = scann.next().charAt(0);
        
        System.out.println("Podaj rozmiar");
        int size = scann.nextInt();
        
        
        
        
        TxtPic3 txtPic3 = new TxtPic3();

        txtPic3
                .setBackground(background)
                .setForeground(foreground)
                .setSize(size)
                .setFileName(name)
                .createTxtPic()
                .save();

    }
}
