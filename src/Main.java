/**
 * Created by kk on 2017/7/20.
 */
public class Main {
    public static void main(String[] args) {

        // 我们有一个初始长度为4的货架
        ProductShelf productShelf = new ProductShelf(4);

        System.out.println("当前货架上商品数量：" + productShelf.getLength());
        System.out.println("正在上架商品..." + productShelf.getLength());

        // 上面摆满了老奶奶的各种稀奇古怪的商品
        productShelf.putProduct(new Product("橡皮擦"));
        productShelf.putProduct(new Product("作业本"));
        productShelf.putProduct(new Product("火锅底料")); // wtf???
        productShelf.putProduct(new Product("耳机"));

        System.out.println("当前货架上商品的数量：" + productShelf.getLength());
        System.out.println("===================");

        // 我们从老奶奶的货架上一个一个来看名称
        System.out.println("商品列表：");
        Iterator it = productShelf.iterator();
        while (it.hasNext()) {
            Product product = (Product) it.next();
            System.out.println(product.getName());
        }
    }
}
