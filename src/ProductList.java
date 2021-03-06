
/**
 * ABC Company SortingUtility.ProductList class. Has at least 3 attributes.
 *
 * @author Gabriel Alfredo Siguenza <sigue005@cougars.csusm.edu>
 * @author
 * @author
 *
 * @@ - indicates comment to be deleted.
 * TODO: ADD YOUR INFORMATION TO AUTHOR LIST
 */

import java.util.*;
public class ProductList implements List<Product>, Logger{

    private ArrayList<Product> items;

    // DEFAULT CONSTRUCTOR
    public ProductList() {
        items = new ArrayList<Product>();
    }

    public void displayAll(){
        System.out.println("The list contains: ");
        for(Product entry: items){
            System.out.println(entry); // print each item in the items list.
        }
    }

    @Override
    public void displaySortedList(ProductList p) throws Exception {
        System.out.println("Retrieving SortedList..."); // the real product.
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * TODO: Test this method
     *
     * @param product
     * @return
     */
    @Override
    public boolean add(Product product) {
        if(product!=null){
            items.add(new Product(product.getID(),product.getName(),product.getPrice()));
        }
        else{
            System.err.println("ERROR: Trying to add a null object!\nExiting program....");
            System.exit(0);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Product get(int index) {
        if(!items.isEmpty()) {
            return items.get(index);
        }
        return null;
    }

    @Override
    public Product set(int index, Product element) {
        return null;
    }

    @Override
    public void add(int index, Product element) {

    }

    @Override
    public Product remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Product> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Product> listIterator(int index) {
        return null;
    }

    @Override
    public List<Product> subList(int fromIndex, int toIndex) {
        return null;
    }
}
