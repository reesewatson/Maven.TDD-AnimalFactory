package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {

        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }


    @Test
    public void constructorTest() {

        // Given
        String givenName = "Charlie";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test
    public void speakTest(){

        // Given
        Dog dog = new Dog("Charlie", new Date(), 0);

        // When
        String speakResult = dog.speak();

        // Then
        Assert.assertEquals("Ruff!", speakResult);
    }


    @Test
    public void setBirthDateTest(){

        // Given;
        Date date = new Date(12251985);
        Dog dog = new Dog("Charlie", date, 0);
        Date newDate = new Date(12251985);

        // When
        dog.setBirthDate(newDate);

        // Then
        Assert.assertEquals(newDate, dog.getBirthDate());

    }


    @Test
    public void eatTest(){

        // Given
        Dog dog = new Dog("Charlie", new Date(), 0);
        Food food = new Food();

        // When

        dog.eat(food);

        // Then
        Assert.assertEquals(new Integer(1), dog.getNumberOfMealsEaten());

        // When

        dog.eat(food);
        dog.eat(food);
        dog.eat(food);

        // Then

        Assert.assertEquals(new Integer(4), dog.getNumberOfMealsEaten());

    }


    @Test
    public void getIdTest(){

        // Given
        Integer id = 0;
        Dog dog = new Dog("Charlie", new Date(), 0);

        // When
        Integer getIdResult = dog.getId();

        // Then
        Assert.assertEquals(id, getIdResult);

    }


    @Test
    public void animalInheritanceTest() {

        // Given
        Dog dog = new Dog("Charlie", new Date(), 0);

        // When
        boolean dogIsAnimalResult = dog instanceof Animal;

        // Then
        Assert.assertEquals(true, dogIsAnimalResult);
    }


    @Test
    public void mammalInheritanceTest(){

        // Given
        Dog dog = new Dog("Charlie", new Date(), 0);

        // When
        boolean dogIsMammalResult = dog instanceof Mammal;

        // Then
        Assert.assertEquals(true, dogIsMammalResult);
    }


}
