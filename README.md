# 一天一个设计模式 - Iterator

## Iterator 模式

Iterator 模式粗暴地理解就是一个个遍历。先看栗子：

```
int length = arr.length;
for(int i = 0; i < length; i++) {
  System.out.println(arr[i)
}
```

程序中我们经常用到这样的循环，实现从头到尾的遍历工作。

**如果我们将这其中的 i 进行抽象化，在设计模式中就叫做 Iterator 模式，俗称迭代器**。

用这种设计模式，我们自己实现一个把商品放置到货架上，并把商品名称按照排列顺序打印出来的小栗子。

这里关于货架和商品类的定义就不再赘述，直接看主程序：

```java
public class Main {
  public static void main(String[] args) {
    // 我们有一个长度为4的货架
    ProductShelf productShelf = new ProductShelf(4);
    
    // 上面摆满了老奶奶的各种稀奇古怪的商品
    productShelf.putProduct("橡皮擦");
    productShelf.putProduct("作业本");
    productShelf.putProduct("火锅底料");// wtf???
    productShelf.putProduct("耳机");
    
    // ProductShelf 引入了 Iterator
    Iterator it = productShelf.iterator();
    
    // 我们从老奶奶的货架上一个一个来看商品名称
    while(it.hasNext()) {
      Product product = (Product)it.next();
      System.out.println(product.getName());
    }
    
  }
}
```

> Demo 代码可以参考

## 解惑

### 为什么要用 Iterator ，不直接用 for 循环遍历呢？

引入 Iterator 之后可以将遍历和实现分开，看刚才的 while 循环，我们并没有调用 ProductShelf 中的任何方法，在循环过程中，我们不依赖 ProductShelf 的实现。也就是说不管编写 ProductShelf 的是谁，我们都能拿过来就能遍历，管它是怎么存储 Product，使用 List 还是 Vector 或者其他什么的，对于开发者来说非常方便。

### 迭代器只能从前往后遍历？

不是的，我们可以根据需要自己编写 Iterator ，让它从后往前，指定下标或者任何你需要的方式。
