/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task;

/**
 *
 * @author TECHNIFI 1
 */
public class Demo {

	public static void main(String[] args) {
		SingletonExample2.Configuration config = SingletonExample2.Configuration.getInstance();
		System.out.println(config.getValue("mode"));
		System.out.println(config.getValue("font-size"));
		System.out.println(config.getValue("font-type"));

	}
}