/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ObserverPatternExample2;

public interface Publisher {
	void subscribe(Subscriber s);
	void unscubscribe(Subscriber s);

}