/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;
import java.time.DayOfWeek;
 import static java.time.DayOfWeek.*;
 import java.time.LocalDate;
 import java.time.temporal.ChronoField;
/**
 *
 * @author Kuba
 */
public class _run {
    public static void main(String [] args){
        MessageFactory factory = null;

 LocalDate today = LocalDate.now();
 DayOfWeek dayOfWeek =
 DayOfWeek.of(today.get(ChronoField.DAY_OF_WEEK));

 switch(dayOfWeek) {
 case MONDAY : factory = new Monday(); break;
 case TUESDAY : factory = new Tuesday(); break;
 case WEDNESDAY : factory = new Wednesday(); break;
 case THURSDAY: factory = new Thursday(); break;
 case FRIDAY: factory = new Friday(); break;
 case SATURDAY: factory = new Saturday(); break;
 case SUNDAY: factory = new Sunday(); break;
 }
 System.out.println(factory.createIntroMessage());
 System.out.println(factory.createMainMessage());
 System.out.println(factory.createClosingMessage());
 }
}
