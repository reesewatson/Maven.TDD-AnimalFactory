package rocks.zipcodewilmington;

import org.junit.Test;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
@Test
    public void CreateDogTest() {
    //Given
    AnimalFactory factory = new AnimalFactory();
    String expectedName = "Charlie";
    Date expectedDate = new Date(1234);

    //When
    Dog dog = factory.createDog(expectedName, expectedDate);

    //Then
    Assert.assertEquals(expectedName, dog.getName());
    Assert.assertEquals(expectedDate, dog.getBirthDate());
}

@Test
    public void CreateCatTest() {
    //Given
    AnimalFactory factory = new AnimalFactory();
    String expectedName = "Nightingale";
    Date expectedDate = new Date(2345);

    //When
    Cat cat = factory.createCat(expectedName, expectedDate);

    //Then
    Assert.assertequals(expectedname, cat.getName());
    Assert.assertEquals(expectedDate, cat.getBirthDate());
}

}
