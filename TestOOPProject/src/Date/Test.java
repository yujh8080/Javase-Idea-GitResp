package Date;

import java.util.Scanner;

/**
 * @Auther: yujh
 * @Date: 2020/7/3 - 07 - 03 - 19:43
 * @Description: cn.sjxy
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择你想要购买的披萨（1.培根披萨 2.水果披萨）");
        int choice = sc.nextInt();//选择
        //通过工厂获取披萨
        Pizza pizza = PizzaStore.getPizza(choice);
        System.out.println(pizza.showPizza());

    }
}
