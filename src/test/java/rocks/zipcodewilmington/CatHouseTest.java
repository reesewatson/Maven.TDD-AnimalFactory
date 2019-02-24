package rocks.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {

        //Given
        Cat cat = new Cat("Nightingale", new Date(), 0);

        //When
        CatHouse.add(cat);

        //Then
        Assert.assertEquals(cat, CatHouse.getCatById(0));
    }

    @Test
    public void RemoveCat() {

        //Given
        Cat cat = new Cat("Nightingale", new Date(), 0);
        CatHouse.add(cat);

        //When
        CatHouse.remove(cat);

        //Then
        Assert.assertEquals("Nightingale", CatHouse.getCatById(0));
    }

    @Test
    public void RemoveCatWithId() {
        //Given
        Cat cat = new Cat("Nightingale", new Date(), 0);
        CatHouse.add(cat);

        //When
        Cat catNumberTwo = CatHouse.getCatById(0);

        //Then
        Assert.assertEquals(0, catNumberTwo.getId(0));
    }

    @Test
    public void GetNumberOfCatsTest() {
        //Given
        Cat cat = new Cat("Nightingale", new Date(), 0);
        CatHouse.clear();

        //When
        Integer numberOfCats = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(new Integer(0), numberOfCats());
    }
}
