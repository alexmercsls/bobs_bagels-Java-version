public class Basket{


    String [] basketList;
    Item item;

    public Basket(String[] basketList, Item item) {
        this.basketList = basketList;
        this.item = item;
    };

    public String[] getBasketList() {
        return basketList;
    };

    public void setBasketList(String[] basketList) {
        this.basketList = basketList;
    };

}
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

