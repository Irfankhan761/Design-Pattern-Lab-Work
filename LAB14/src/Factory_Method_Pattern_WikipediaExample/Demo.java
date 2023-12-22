package Factory_Method_Pattern_WikipediaExample;


import java.util.ArrayList;

/**
 *
 * @author Irfan Khan
 */
public class Demo {

    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();

       ArrayList<IPerson> persons = new ArrayList<>();

        persons.add(factory.getPerson(PersonType.Rural));
        persons.add(factory.getPerson(PersonType.Urban));

        for (IPerson person : persons) {

            System.out.println(person.getName());
        }
    }

}
