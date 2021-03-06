/**
 * Driver for testing SortingUtility.SortingUtility.java. Demonstrates implementation and provides stubs for development.
 *
 * @author Gabriel Alfredo Siguenza <sigue005@cougars.csusm.edu>
 * @author
 * @author
 *
 * @@ - indicates comment to be deleted.
 * TODO: ADD YOUR INFORMATION TO AUTHOR LIST
 */
public class Main {
    /***********************************************
     * ALGORITHM:
     *  1. CREATE PRODUCTS
     *  2. POPULATE PRODUCT LIST
     *  3. SORT PRODUCT USING SORTING UTILITY
     *  4. DISPLAY SORTED PRODUCT LIST
     */
    public static void main(String[] args) {

        SortingUtility s = new SortingUtility();
//        1. CREATE PRODUCTS
        Product hammer = new Product("5111XD", "hammer", 4.00);
        Product tinyJesusStatue = new Product("7822RC", "tinyJesusStatue",9.00);
        Product engine = new Product("1222OX","engine",145.00);
        Product keyboard = new Product("3778VP","keyboard",11.00);

//        2. POPULATE PRODUCT LIST
        ProductList items = new ProductList();

        items.add(hammer);
        items.add(tinyJesusStatue);
        items.add(engine);
        items.add(keyboard);

//        for testing display product
        items.displayAll();

        s.sort(items, 1);
    }
}
