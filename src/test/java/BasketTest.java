import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    @DisplayName("check if item added to list")
    void addItem(){
        //Arrange
        ArrayList<Item> basketList = new ArrayList<>();
        Item item1= new Item("Wholewheat bagel");
        Item item2 = new Item("White bagel");
        int expected = 2;
        //Act
        basketList.add(item1);
        basketList.add(item2);
        int result = basketList.size();
        //Assert
        assertEquals(expected,result);
    };

    @Test
    @DisplayName("check if item removed from list")
    void removeItem(){
        //Arrange
        ArrayList<Item> basketList = new ArrayList<>();
        Item item1= new Item("Wholewheat bagel");
        Item item2 = new Item("White bagel");
        int expected = 0;
        //Act
        basketList.remove(item1);
        int result = basketList.size();
        //Assert
        assertEquals(expected,result);
    };





}
