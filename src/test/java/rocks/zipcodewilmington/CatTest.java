package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
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
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

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
        Cat cat = new Cat(null, null, null);
        String givenName = "Nightingale";

        // When
        cat.setName(givenName);

        // Then
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void speakTest(){

        // Given
        Cat cat = new Cat("Nightingale", new Date(), 0);

        // When
        String speakResult = cat.speak();

        // Then
        Assert.assertEquals("meow!", speakResult);
    }


    @Test
    public void setBirthDateTest(){

        // Given;
        Date date = new Date(12191985);
        Cat cat = new Cat("Nightingale", date, 0);
        Date newDate = new Date(12191985);

        // When
        cat.setBirthDate(newDate);

        // Then
        Assert.assertEquals(newDate, cat.getBirthDate());

    }


    @Test
    public void eatTest(){

        // Given
        Cat cat = new Cat("Nightingale", new Date(), 0);
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
        Integer id = 0;
        Cat cat = new Cat("Nightingale", new Date(), id);

        // When
        Integer getIdResult = cat.getId();

        // Then
        Assert.assertEquals(id, getIdResult);

    }


    @Test
    public void animalInheritanceTest() {

        // Given
        Cat cat = new Cat("Nightingale", new Date(), 0);

        // When
        boolean catIsAnimalResult = cat instanceof Animal;

        // Then
        Assert.assertEquals(true, catIsAnimalResult);
    }


    @Test
    public void mammalInheritanceTest(){

        // Given
        Cat cat = new Cat("Nightingale", new Date(), 0);

        // When
        boolean catIsMammalResult = cat instanceof Mammal;

        // Then
        Assert.assertEquals(true, catIsMammalResult);
    }
}