package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import org.junit.Assert;
import java.util.Date;

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
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }


    @Test
    public void addDogTest() {
        //Given
        Dog dog = new Dog("Charlie", new Date(), 0);

        //When
        DogHouse.add(dog);

        //Then
        Assert.assertEquals(dog, DogHouse.getDogById(0));
    }

    @Test
    public void RemoveDog() {
        //Given
        Dog dog = new Dog("Charlie", new Date(), 0);
        DogHouse.add(dog);

        //When
        DogHouse.remove(dog);

        //Then
        Assert.assertEquals(dog, DogHouse.getDogById(0));
    }

    @Test
    public void RemoveDogWithId() {
        //Given
        Dog dog = new Dog("Charlie", new Date(), 0);
        DogHouse.add(dog);

        //When
        Dog dogNumberTwo = DogHouse.getDogById(0);

        //Then
        Assert.assertEquals(0, dogNumberTwo.getId(0));
    }

    @Test
    public void GetNumberOfDogsTest() {
        //Given
        Dog dog = new Dog("Charlie", new Date(), 0);
        DogHouse.clear();

        //When
        Integer numberOfDogs = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(new Integer(0), numberOfDogs());
    }
}


