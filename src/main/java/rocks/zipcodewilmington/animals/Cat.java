package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {
    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "meow!";
    }

    public static String getName(String name) {
        return "Nihgtingale";
    }

    public static int setBirthDate(int date) {
        return 3;
    }

    public static Boolean eat(Boolean food) {
        return true;
    }

    public static int getId(int id) {
        return 0;
    }
}
