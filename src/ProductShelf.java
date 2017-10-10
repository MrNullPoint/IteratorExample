import java.util.ArrayList;

/**
 * Created by kk on 2017/7/20.
 */
public class ProductShelf implements Aggregate{

    private ArrayList<Product> products;

    public ProductShelf(int maxSize) {
        this.products = new ArrayList<Product>(maxSize);
    }

    public Product getProductAt(int index) {
        return products.get(index);
    }

    public void putProduct(Product product) {
        this.products.add(product);
    }

    public int getLength() {
        return products.size();
    }

    @Override
    public Iterator iterator() {
        return new ProductShelfIterator(this);
    }

}
