package rocks.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getCatById;
import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getNumberOfCats;


/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    private Cat testCat = new Cat(null, null, null);

    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {

        //Given
        Cat cat = new Cat("Nightingale", new Date(), 77);

        //When
        CatHouse.add(cat);

        //Then
        Assert.assertEquals(cat, CatHouse.getCatById(77));
    }

    @Test
    public void RemoveCat() {

        //Given
        Cat cat = new Cat("Zula", new Date(), 76);
        CatHouse.add(cat);

        //When
        CatHouse.remove(cat);

        //Then
        Assert.assertEquals(null, CatHouse.getCatById(76));
    }

    @Test
    public void RemoveCatWithId() {
        //Given
        Cat cat = new Cat("Harry", new Date(), 75);
        CatHouse.add(cat);

        //When
        CatHouse.getCatById(75);

        //Then
        Assert.assertEquals(null, cat.getId(75));
    }

    @Test
    public void GetNumberOfCatsTest() {
        //Given
        Cat cat = new Cat("Oreo", new Date(), 74);
        CatHouse.clear();

        //When
        Integer numberOfCats = getNumberOfCats();

        //Then
        Assert.assertEquals(new Integer(0), getNumberOfCats());
    }
}
