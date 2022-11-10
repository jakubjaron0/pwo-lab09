/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author Kuba
 */
public class Wednesday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Środa.";
 }

 @Override
 public String createMainMessage() {
 return "Środowa praca idzie lepiej";
 }

 @Override
 public String createClosingMessage() {
 return "Trzeci dzień pracy w tym tygodniu minął";
 }
 }
  