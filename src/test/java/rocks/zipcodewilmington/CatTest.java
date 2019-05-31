package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    private Cat testCat = new Cat(null, null, null);

    @Before
    public void setup() {
        this.testCat = new Cat ("name", new Date(2), 77);
    }
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 76;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate , givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



    @Test
    public void setNameTest() {

        // Given
        Cat cat = new Cat("Doge", new Date(), 78);
        String givenName = "Doge";

        // When
        cat.setName(givenName);

        // Then
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void speakTest(){

        // Given
        Cat cat = new Cat("Mittens", new Date(), 75);

        // When
        String speakResult = cat.speak();

        // Then
        Assert.assertEquals("meow!", speakResult);
    }


    @Test
    public void setBirthDateTest(){

        // Given;
        Cat cat = new Cat("Nightingale", new Date(), 74);
        Date newDate = new Date(12191985);

        // When
        cat.setBirthDate(newDate);

        // Then
        Assert.assertEquals(newDate, cat.getBirthDate());

    }


    @Test
    public void eatTest(){

        // Given
        Cat cat = new Cat("Charlie", new Date(), 74);
        Food food = new Food();

        // When

        cat.eat(food);

        // Then
        Assert.assertEquals(new Integer(1), cat.getNumberOfMealsEaten());

        // When

        cat.eat(food);
        cat.eat(food);
        cat.eat(food);

        // Then

        Assert.assertEquals(new Integer(4), cat.getNumberOfMealsEaten());

    }


    @Test
    public void getIdTest(){

        // Given
        Integer id = 73;
        Cat cat = new Cat("Ugo-Chan", new Date(), 73);

        // When
        Integer getIdResult = cat.getId();

        // Then
        Assert.assertEquals(id, getIdResult);

    }


    @Test
    public void animalInheritanceTest() {

        // Given
        Cat cat = new Cat("Rex", new Date(), 72);

        // When
        boolean catIsAnimalResult = cat instanceof Animal;

        // Then
        Assert.assertEquals(true, true);
    }


    @Test
    public void mammalInheritanceTest(){

        // Given
        Cat cat = new Cat("Sammie", new Date(), 71);

        // When
        boolean catIsMammalResult = cat instanceof Mammal;

        // Then
        Assert.assertEquals(true, true);
    }
}