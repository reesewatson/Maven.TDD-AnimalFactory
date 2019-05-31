package rocks.zipcodewilmington;

import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import org.junit.Assert;
import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.*;
import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.getDogById;
import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.getNumberOfDogs;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        clear();

        // When
        add(animal);

        // Then
        getNumberOfDogs();

    }


    @Test
    public void addDogTest() {
        //Given
        Dog dog = new Dog("Max", new Date(), 77);

        //When
        DogHouse.add(dog);

        //Then
        Assert.assertEquals(dog, getDogById(77));
    }

    @Test
    public void RemoveDog() {
        //Given
        Dog dog = new Dog("Jack", new Date(), 76);
        add(dog);

        //When
        remove(dog);

        //Then
        Assert.assertEquals(null, DogHouse.getDogById(76));
    }

    @Test
    public void RemoveDogWithId() {
        //Given
        Dog dog = new Dog("Willa", new Date(), 75);
        add(dog);

        //When
         DogHouse.remove(75);

        //Then
        Assert.assertEquals(null, getDogById(75));
    }

    @Test
    public void GetNumberOfDogsTest() {
        //Given
        Dog dog = new Dog("Sparky", new Date(), 74);
        clear();

        //When
        Integer numberOfDogs = getNumberOfDogs();

        //Then
        Assert.assertEquals(new Integer(0), getNumberOfDogs());
    }
}


