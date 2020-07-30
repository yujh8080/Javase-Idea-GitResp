package Date;

/**
 * @Auther: yujh
 * @Date: 2020/7/3 - 07 - 03 - 19:30
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class BaconPizza extends Pizza {

    private int weight;

    public BaconPizza(int weight) {//空参构造方法
        this.weight = weight;
    }

    public BaconPizza(String name, int size, int price, int weight) {//有参构造方法
        super(name, size, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //重写父类showPizza方法：
    @Override
    public String showPizza() {
        return super.showPizza()+"\n培根的克数是："+weight+"克";
    }
}
