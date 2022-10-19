package bobsBagels;

import java.util.ArrayList;

public class Basket{


   private ArrayList<String> basket;

   private String item;



    public Basket(String item) {
        this.basket = new ArrayList<>();
    }

    void add(String item){
        basket.add(item);
    }
}

