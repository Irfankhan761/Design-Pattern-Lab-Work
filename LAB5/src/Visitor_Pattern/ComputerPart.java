package Visitor_Pattern;

/**
 *
 * @author TECHNIFI 1
 */

public interface ComputerPart {
     void accept(ComputerPartVisitor computerPartVisitor);
     void accept(ComputerPartMaintainer computerPartMaintainer);
}