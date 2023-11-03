/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitor_Pattern;

/**
 *
 * @author TECHNIFI 1
 */

public class Computer implements ComputerPart {

    ComputerPart[] parts;
    public ComputerPart mouse,keyboard,monitor,multimedia;
    public Computer() {
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
        this.multimedia = new Multimedia();
        parts = new ComputerPart[]{mouse, keyboard, monitor, multimedia};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }


    @Override
    public void accept(ComputerPartMaintainer computerPartMaintainer) {
        for (ComputerPart part:parts) {
            part.accept(computerPartMaintainer);
        }
    }
}