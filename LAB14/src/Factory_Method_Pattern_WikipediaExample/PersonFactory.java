package Factory_Method_Pattern_WikipediaExample;

/**
 *
 * @author Irfan Khan
 */
public class PersonFactory {

    public IPerson getPerson(PersonType type) {

        return switch (type) {
            case Rural ->
                new Villager();
            case Urban ->
                new CityPerson();
        };
    }

}
