/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author Kuba
 */
public class Sunday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Niedziela.";
 }

 @Override
 public String createMainMessage() {
 return "Niedzielny odpoczynek mija wyśmienice";
 }

 @Override
 public String createClosingMessage() {
 return "drugi dzień weekendu minał...";
 }
 }