/**
 * Created by kk on 2017/7/20.
 */
public class ProductShelfIterator implements Iterator{

    private ProductShelf productShelf;
    private int index;

    public ProductShelfIterator(ProductShelf productShelf) {
        this.productShelf = productShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < productShelf.getLength();
    }

    @Override
    public Object next() {
        Product p = productShelf.getProductAt(index);
        index++;
        return p;
    }

}
