/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author Kuba
 */
public class Friday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Piątek weekendu początek.";
 }

 @Override
 public String createMainMessage() {
 return "Piątkowa praca idzie lepiej";
 }

 @Override
 public String createClosingMessage() {
 return "Piątek wieczór i humor gitówa";
 }
 }