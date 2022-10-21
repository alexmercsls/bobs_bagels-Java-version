import java.util.ArrayList;

public class Basket{


    //private String[] basketList;
    private ArrayList<> basketList = new ArrayList<>();
    private int capacity;

    Item item;

    public Basket(ArrayList basketList) {
          //this.basketList =  basketList;
         // this.basket1 = basket1;
    };

    public String[] getBasketList() {
        return basketList;
    };

    public void setBasketList(String[] basketList) {
        this.basketList = basketList;
    };

    public int getCapacity() {
        return capacity;
    }

    public void addItem(String[] Item) {
        this.basket1.add(Item);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

    //String[] strArray = new String[10];

//class Basket {
//
//    BasketItems;
//    capacity;
//
//    constructor(capacity) {
//        this.#basketItems = []
//        this.#capacity = capacity
//
//    }
//    get BasketItems() {
//        return this.#basketitems;
//    }
//    get Capacity() {
//        return this.#capacity;
//    }
//
//    set add(item) {
//        if (this.#basketItems.length >= this.#capacity) {
//            console.log("your basket is full")
//        }
//        else if (this.#basketItems.includes(item)) {
//            console.log(item.id)
//            console.log("Already in basket")
//            this.#basketItems.push(item);
//            return 'Already in basket';
//        } else {
//            this.#basketItems.push(item);
//
//
//        }
//    }

