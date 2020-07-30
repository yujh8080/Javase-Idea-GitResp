package Date;

/**
 * @Auther: yujh
 * @Date: 2020/7/3 - 07 - 03 - 19:18
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class FruitsPizza extends Pizza {
   private String burdening;//配料

    public FruitsPizza() {   //空参构造器
    }


    public FruitsPizza(String name, int size, int price, String burdening) {//有参构造器
        super(name, size, price);
        this.burdening = burdening;
    }

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    //重写父类的方法
    @Override
    public String showPizza() {
        return super.showPizza()+"\n你要加入的水果："+burdening;
    }
}
