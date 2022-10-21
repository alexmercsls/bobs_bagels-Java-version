import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    @DisplayName("check if item added to list")
    void addItem(){
        //Arrange
        //ArrayList<Item> Basket = new ArrayList<>();
        Basket basket1 = new Basket();
        Item item1= new Item("Wholewheat bagel");
        Item item2 = new Item("White bagel");
        int expected = 2;
        //Act
        Basket.addItem(item1);
        Basket.addItem(item2);
        int result = Basket.size();
        //Assert
        assertEquals(expected,result);
    };

    @Test
    @DisplayName("check if item removed from list")
    void removeItem(){
        //Arrange
        ArrayList<Item> Basket = new ArrayList<>();
        Item item1= new Item("Wholewheat bagel");
        Item item2 = new Item("White bagel");
        int expected = 0;
        //Act
        Basket.remove(item1);
        int result = Basket.size();
        //Assert
        assertEquals(expected,result);
    };

    @Test
    @DisplayName("check if basket is full")
    void isFull(){
        //Arrange
        Basket basket = new Basket();
        //ArrayList<Item> Basket = new ArrayList<>(1);
        Item item1= new Item("Wholewheat bagel");
        Item item2 = new Item("White bagel");
        int expected = 1;

        //Act
        //ArrayList<Integer> arr=new ArrayList<Integer>(10);
//        Basket.add(item1);
//        Basket.add(item2);


        int result = Basket.size();

        //Assert
        assertEquals(expected,result);
    };






}
