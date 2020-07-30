package Date;

/**
 * @Auther: yujh
 * @Date: 2020/7/3 - 07 - 03 - 19:11
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class Pizza {
    private String name; //名字
    private int size;   //大小
    private int price;  //价格
    public Pizza(){      //空参构造方法

    }

    public Pizza(String name, int size, int price) {//有参构造器
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String showPizza(){
        return "匹萨的名字是："+name+"\n匹萨的大小是："+size+"寸\n匹萨的价格："+price+"元";
    }
}
