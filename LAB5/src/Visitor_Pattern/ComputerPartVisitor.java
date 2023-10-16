/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor_Pattern;

/**
 *
 * @author TECHNIFI 1
 */
public interface ComputerPartVisitor {
     void visit(Computer computer);

     void visit(Mouse mouse);

     void visit(Keyboard keyboard);

     void visit(Monitor monitor);
}
